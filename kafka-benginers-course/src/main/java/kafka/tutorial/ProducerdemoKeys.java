package kafka.tutorial;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducerdemoKeys {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 final Logger logger = LoggerFactory.getLogger(ProducerdemoKeys.class);
		
		String bootstrapServers= "localhost:9092";
		
		//Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		
		//Create the producer
		
		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);
		
		//Create a Record
		String topic="first_topic";
		
		
		for (int i = 0; i < 10; i++) {
			String message = "Java "+Integer.toString(i);
			String key = "id_"+Integer.toString(i);
				
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic,key,message);
		
		logger.info("Key: "+key);
		
//		id_0 Partition1
//		id_1 Partition0
//		id_2 Partition2
//		id_3 Partition0
//		id_4 Partition2
//		id_5 Partition2
//		id_6 Partition0
//		id_7 Partition2
//		id_8 Partition1
//		id_9 Partition2
		// With Id it's going to the same partition
		//Send Data - asynchronous
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
		}).get();//don't do in production
		
		//Flush data
		producer.flush();
		}
		producer.close();
		
	
	}
	

	
}
