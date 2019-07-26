package kafka.tutorial;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class producerdemo {

	public static void main(String[] args) {
		
		String bootstrapServers= "localhost:9092";
		
		//Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		//Create the producer
		
		@SuppressWarnings("resource")
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		
		//Create a Record
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("first_topic", "Hi from Java");
		//Send Data - asynchronus
		producer.send(record);
		
		//Flush data
		producer.flush();
		producer.close();
		
	
	}
	

	
}
