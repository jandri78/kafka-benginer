package kafka.tutorial;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsumerDemoGroup {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(ConsumerDemoGroup.class.getName());
		String bootstrapServers = "localhost:9092";
		String groupId = "my-fifth-application";
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
		
		//Subscribe consumer to our topic
		consumer.subscribe(Collections.singleton(topic));
		//consumer.subscribe(Arrays.asList(topic)); For more than one topic
		
		//poll for new data
		while (true) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			
			for (ConsumerRecord<String,String> consumerRecord : records) {
				logger.info("key: "+consumerRecord.key()+", value: "+consumerRecord.value());
				logger.info("Partition: "+ consumerRecord.partition()+", Ofsset: "+consumerRecord.offset());
			}
			
		}

	}
}
