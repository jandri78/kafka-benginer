package kafka.tutorial;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerDemoWithThread {

	public static void main(String[] args) {
	
		new ConsumerDemoWithThread().run();

	}
	
	private ConsumerDemoWithThread() {
		
	}
	
	private void run() {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLogger(ConsumerDemoWithThread.class.getName());
		String bootstrapServers = "localhost:9092";
		String groupId = "my-sixth-application";
		String topic="first_topic";

		CountDownLatch latch = new  CountDownLatch(1);
		logger.info("Creating a Consumer");
		Runnable myConsumerRunnable = new ConsumerRunnable(bootstrapServers, groupId, topic, latch);
		
		Thread myThread = new Thread(myConsumerRunnable);
		myThread.start();
		
		// add a shutdown hook
		Runtime.getRuntime().addShutdownHook(new Thread( () -> {
			logger.info("Cougth shutDown hook");
			((ConsumerRunnable)myConsumerRunnable).shutdown();
			try {
				latch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("application exited");
		}
		));
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			logger.info("app is closing");
		}
	}
	
	
	//-------------------
	public class ConsumerRunnable implements Runnable{
		
		private CountDownLatch latch;
		private KafkaConsumer<String, String> consumer;
		private Logger logger = LoggerFactory.getLogger(ConsumerRunnable.class.getName());


		public ConsumerRunnable(String bootstrapServers,String groupId,String topic,CountDownLatch latch) {
			this.latch=latch;
			
			
			// Create a producer properties
			Properties properties = new Properties();
			properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
			properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());//Deserializer for consumer
			properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
			properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
			properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
			
			//Create consumer
			consumer = new KafkaConsumer<String, String>(properties);
			
			//Subscribe consumer to our topic
			consumer.subscribe(Collections.singleton(topic));
			//consumer.subscribe(Arrays.asList(topic)); For more than one topic
		}
		
		public void run() {
			// TODO Auto-generated method stub

			// poll for new data
			try {

				while (true) {
					ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));

					for (ConsumerRecord<String, String> consumerRecord : records) {
						logger.info("key: " + consumerRecord.key() + ", value: " + consumerRecord.value());
						logger.info(
								"Partition: " + consumerRecord.partition() + ", Ofsset: " + consumerRecord.offset());
					}

				}
			} catch (WakeupException e) {
				// TODO: handle exception
				logger.info("Shutdown Signal");
			}finally {
				consumer.close();
				//tell our main code we're done with the consumer
				latch.countDown();
			}

		}
		
		public void shutdown() {
			//interrupt consumer.poll() , throw WakeUpExceptions
			consumer.wakeup();
		}
		
	}
}
