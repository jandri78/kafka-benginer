package kafka.tutorial;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducerdemoCallback {

	public static void main(String[] args) {
		
		 final Logger logger = LoggerFactory.getLogger(ProducerdemoCallback.class);
		
		String bootstrapServers= "localhost:9092";
		
		//Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		//Create the producer
		
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		
		//Create a Record
		
		for (int i = 0; i < 10; i++) {
			
		
		ProducerRecord<String, String> record = new ProducerRecord<String, String>("first_topic", "Java"+i);
		//Send Data - asynchronus
		producer.send(record, new Callback() {
			
			public void onCompletion(RecordMetadata metadata, Exception exception) {
				// TODO Auto-generated method stub
				if (exception == null) {
					logger.info("Recived new metadata. \n"+
				"Topic:"+ metadata.topic()+"\n"+
				"Partition"+ metadata.partition()+"\n"+
				"Offset"+ metadata.offset()+"\n"
				+"time" +metadata.timestamp());
					
				}else {
					logger.error("Error producing ",exception);
				}
				
				
			}
		});
		
		//Flush data
		producer.flush();
		}
		producer.close();
		
	
	}
	

	
}
