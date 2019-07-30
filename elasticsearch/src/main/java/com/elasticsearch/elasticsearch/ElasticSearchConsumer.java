package com.elasticsearch.elasticsearch;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.apache.http.HttpHost;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonParser;



public class ElasticSearchConsumer {
	
	
	public static RestHighLevelClient createClient() {
		
		String hostname="localhost";
			
		RestHighLevelClient client = new RestHighLevelClient(
		        RestClient.builder( new HttpHost(hostname, 9200, "http")));
		return client;
	}
	
	public static KafkaConsumer<String, String> createConsumer() {
		
		String bootstrapServers = "localhost:9092";
		String groupId = "kafka-demo-elasticsearch";
		String topic="twitter_tweets";
		// Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());//Deserializer for consumer
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		
		
		//Create consumer
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
		consumer.subscribe(Arrays.asList(topic));
		
		return consumer;
	}
	
	public static void main(String[] args) throws IOException {
		
		Logger logger = LoggerFactory.getLogger(ElasticSearchConsumer.class.getName());
		
		RestHighLevelClient client = createClient();
		
		
		KafkaConsumer<String, String> consumer = createConsumer();
		
		
		//poll for new data
		while (true) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			
			for (ConsumerRecord<String,String> consumerRecord : records) {
				//insert Data into elastic
				String id = extracIdFromTweet(consumerRecord.value());
				
				String jsonString =consumerRecord.value();
				
				
				IndexRequest indexRequest = new IndexRequest("twitter","tweets",id).source(jsonString,XContentType.JSON);
				
				IndexResponse indexResponse = client.index(indexRequest, RequestOptions.DEFAULT);
				String idres = indexResponse.getId();
				logger.info(idres);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					client.close();	
				}
				
			}
			
		}
 			//client.close();	
	}

	private static JsonParser jsonParser = new JsonParser();
	
	private static String extracIdFromTweet(String tweetJson) {
		String parser = jsonParser.parse(tweetJson).getAsJsonObject().get("id_str").getAsString();

		return parser;
	}

}
