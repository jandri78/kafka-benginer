package com.kafkaStreamsStarterProject;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//String bootstrapServers= "localhost:9092";
//		
//		//Create a producer properties
//		Properties properties = new Properties();
//		properties.setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
//		properties.setProperty(StreamsConfig.APPLICATION_ID_CONFIG,"demo-kafka-streams");
//		properties.setProperty(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG,Serdes.StringSerde.class.getName());
//		properties.setProperty(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serdes.StringSerde.class.getName());
//	
//    	// Create topology
//		
//		StreamsBuilder streamsBuilder = new StreamsBuilder();
//		
//		//input Topic
//		KStream<String, String> inputTopoic = streamsBuilder.stream("streams-wordcount-input");
//		KStream<String, String> filteredStream = inputTopoic
//				.mapValues(mapper -> mapper.toUpperCase())
//				.flatMapValues(mapper -> Arrays.asList(mapper.split("\\W+")))
//				.selectKey((key,word)-> word);
//		
//		filteredStream.to("streams-wordcount-output");
//
//    	//Build the topology
//		
//		KafkaStreams kafkaStreams = new KafkaStreams(
//				streamsBuilder.build(),
//				properties);
//    	//Start our streams application
//		
//		kafkaStreams.start();
//		
//		System.out.println(kafkaStreams.toString());
		
//		
//		<!-- https://mvnrepository.com/artifact/org.apache.kafka/kafka-streams -->
//		<dependency>
//			<groupId>org.apache.kafka</groupId>
//			<artifactId>kafka-streams</artifactId>
//			<version>2.3.0</version>
//		</dependency>
	}

}
