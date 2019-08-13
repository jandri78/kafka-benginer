package com.kafka.streams;

import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;

import com.google.gson.JsonParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Create properties 
	String bootstrapServers= "localhost:9092";
		
		//Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
		properties.setProperty(StreamsConfig.APPLICATION_ID_CONFIG,"demo-kafka-streams");
		properties.setProperty(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG,Serdes.StringSerde.class.getName());
		properties.setProperty(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.StringSerde.class.getName());
	
    	// Create topology
		
		StreamsBuilder streamsBuilder = new StreamsBuilder();
		
		//input Topic
		KStream<String, String> inputTopoic = streamsBuilder.stream("twitter_tweets");
		KStream<String, String> filteredStream = inputTopoic.filter(
				(k,jsonTweet) -> extracUserFollowersInTweet(jsonTweet) > 1000		
		);
		filteredStream.to("important_tweets");

    	//Build the topology
		
		KafkaStreams kafkaStreams = new KafkaStreams(
				streamsBuilder.build(),
				properties);
    	//Start our streams application
		
		kafkaStreams.start();
		
		// kafka-console-consumer.sh --bootstrap-server 127.0.0.1:9092 --topic important_tweets --from-beginning|grep followers_count
		
    }
    
	private static JsonParser jsonParser = new JsonParser();
	
	private static Integer extracUserFollowersInTweet(String tweetJson) {
		
		try {
		
		return  jsonParser.parse(tweetJson)
				.getAsJsonObject()
				.get("user")
				.getAsJsonObject()
				.get("followers_count")
				.getAsInt();
		}catch (NullPointerException e) {
			// TODO: handle exception
			return 0;
		}

	}
}
