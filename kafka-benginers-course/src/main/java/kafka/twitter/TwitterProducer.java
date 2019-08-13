package kafka.twitter;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

public class TwitterProducer {

	Logger logger = LoggerFactory.getLogger(TwitterProducer.class.getName());
	String consumerKey = "b2j1YZ0wekuIUGQ10nTVerTmJ";
	String consumerSecret = "nZ3GE9eZT9ljYJq0NlP4KzKIRfo2Ouh32kw0p1oh7RkYQaYnP6";
	String token = "981596818118250498-J3oHBET52sm3OREsf0jYaLNqkDmlmgM";
	String secret = "An0xFKgwO6EkyE3TVqn5AQUv3bhDKSspLrNIaBQZoTOvj";

	List<String> terms = Lists.newArrayList("usa","soccer");
	
	public TwitterProducer() {
	}

	public static void main(String[] args) {

		new TwitterProducer().run();
	}

	public void run() {
		// Create a Twitter Client
		BlockingQueue<String> msgQueue = new LinkedBlockingQueue<String>(100000);

		final Client client = createTwitterClient(msgQueue);
		client.connect();

		// Create a producer
		final KafkaProducer<String, String> producer = createKafkaproducer();
		
		//
		Runtime.getRuntime().addShutdownHook(new Thread(()->{
			logger.info("Stoppin application");
			client.stop();
			logger.info("Closing producer....");
			producer.close();
			logger.info("done");
		}));
		
		// loop to send messages to kafka
		// on a different thread, or multiple different threads....
		while (!client.isDone()) {
			String msg = null;
			try {
				msg = msgQueue.poll(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
				client.stop();
			}
			if (msg != null) {
				logger.info(msg);
				producer.send(new ProducerRecord<String, String>("twitter_tweets", null,msg), new Callback() {
					
					@Override
					public void onCompletion(RecordMetadata metadata, Exception exception) {
						if (exception != null) {
							logger.error("Something bad happend",exception);
						}				
					}
				});
			}
			logger.info("End of Application");

		}

	}



	public Client createTwitterClient(BlockingQueue<String> msgQueue) {

		/**
		 * Declare the host you want to connect to, the endpoint, and authentication
		 * (basic auth or oauth)
		 */
		Hosts hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
		StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
		// Optional: set up some followings and track terms
		// List<Long> followings = Lists.newArrayList(1234L, 566788L);
		
		// hosebirdEndpoint.followings(followings);
		hosebirdEndpoint.trackTerms(terms);

		// These secrets should be read from a config file
		Authentication hosebirdAuth = new OAuth1(consumerKey, consumerSecret, token, secret);

		ClientBuilder builder = new ClientBuilder().name("Hosebird-Client-01") // optional: mainly for the logs
				.hosts(hosebirdHosts).authentication(hosebirdAuth).endpoint(hosebirdEndpoint)
				.processor(new StringDelimitedProcessor(msgQueue));
		// optional: use this if you want to process client events

		Client hosebirdClient = builder.build();
		// Attempts to establish a connection.
		// hosebirdClient.connect();
		return hosebirdClient;

	}
	
	public KafkaProducer<String, String> createKafkaproducer() {
		
		String bootstrapServers= "localhost:9092";
		
		//Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		// Create a safe Producer
		properties.setProperty(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, "true");
		properties.setProperty(ProducerConfig.ACKS_CONFIG, "all");
		properties.setProperty(ProducerConfig.RETRIES_CONFIG,Integer.toString(Integer.MAX_VALUE));
		properties.setProperty(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, "5");// kafka 2.0 >= 1.1 use 5 , use 1 otherwise
		//Batch
		properties.setProperty(ProducerConfig.COMPRESSION_TYPE_CONFIG, "snappy");
		properties.setProperty(ProducerConfig.LINGER_MS_CONFIG, "20");//20ms
		properties.setProperty(ProducerConfig.BATCH_SIZE_CONFIG, Integer.toString(32*1024));//32 kb batch size
		
		//Create the producer
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		
		return producer;
	}
}
