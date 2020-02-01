package com.kafkaStreamsStarterProject;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;
import org.apache.kafka.streams.kstream.KTable;



/**
 * Hello world!
 *
 */
public class StreamsStarterApp 
{
    public static void main( String[] args )
    {
        Properties properties = new Properties();
        properties.put(StreamsConfig.APPLICATION_ID_CONFIG, "streams-starter-app");
        properties.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        properties.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        properties.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        
        
        KStreamBuilder builder = new KStreamBuilder();
        
        KStream<String,String> wordCountInput = builder.stream("streams-wordcount-input");
        
        KTable<String, Long> wordCounts = wordCountInput
        		//Values to LowerCase
        		.mapValues(textLine -> textLine.toLowerCase())
        		//3. flatmap values split by space
        		.flatMapValues(textLine -> Arrays.asList(textLine.split("\\W+")))
        		//4. select key to apply a key
        		.selectKey((key,word)-> word)
        		.groupByKey()
        		.count();
        		//5. group by key before aggregation
        		
        		//6. count occurrences;
        
//        wordCounts.to("streams-wordcount-output");
        wordCounts.to(Serdes.String(),Serdes.Long(),"streams-wordcount-output");
        
        KafkaStreams streams = new KafkaStreams(builder,properties);
        streams.start();
        
        System.out.println(streams.toString());
        
        Runtime.getRuntime().addShutdownHook(new Thread(streams::close));

    }
}
