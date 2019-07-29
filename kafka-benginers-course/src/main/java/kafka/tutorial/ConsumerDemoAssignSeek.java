package kafka.tutorial;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerDemoAssignSeek {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(ConsumerDemoAssignSeek.class.getName());
		String bootstrapServers = "localhost:9092";
		String groupId = "my-seven-application";
		String topic="first_topic";
		// Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		properties.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());//Deserializer for consumer
		properties.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		properties.setProperty(ConsumerConfig.GROUP_ID_CONFIG, groupId);
		properties.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		
		
		//Create consumer
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);
		
		//assign
		TopicPartition partitionToRead = new TopicPartition(topic, 0);
		long offsetToReadFrom= 15L;
		consumer.assign(Arrays.asList(partitionToRead));
		//seek
		consumer.seek(partitionToRead, offsetToReadFrom);

		int numberOfMessagesToRead=5;
		boolean keepReading = true;
		int numberOfMessagesReadSoFar=0;
		
		//poll for new data
		while (keepReading) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			
			for (ConsumerRecord<String,String> consumerRecord : records) {
				numberOfMessagesReadSoFar++;
				logger.info("key: "+consumerRecord.key()+", value: "+consumerRecord.value());
				logger.info("Partition: "+ consumerRecord.partition()+", Ofsset: "+consumerRecord.offset());
				if (numberOfMessagesReadSoFar >= numberOfMessagesToRead) {
					keepReading = false;
					break;
				}
				
			}
			
		}

	}
}
