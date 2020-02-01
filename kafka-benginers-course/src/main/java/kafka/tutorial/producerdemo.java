package kafka.tutorial;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import com.telintel.DripsShared.Model.AccountInformation;
import com.telintel.DripsShared.Model.CommunicationChannelCommand;
import com.telintel.DripsShared.Model.DripProperty;

public class producerdemo {

	private static final String DRIP_EMAIL_ADAPTER_TOPIC = "DRIP_EMAIL_ADAPTER_TOPIC";

	public static void main(String[] args) {
		
		String source = "jorge.perez@telintel.net";
		String destination = "david.cadena@telintel.net";
		
		Map<String, Map<String, Object>> metaData = new HashMap<String, Map<String,Object>> ();
		metaData.put("customerId", new HashMap<String, Object>());
		
		HashMap<String, DripProperty> commandInformation = new HashMap<>();
		commandInformation.put("fromEmail", new DripProperty("fromEmail", source));
		commandInformation.put("toEmail", new DripProperty("toEmail", destination));
		commandInformation.put("subject", new DripProperty("subject", "asunto"));
		commandInformation.put("preHeader", new DripProperty("preHeader", "header"));
		commandInformation.put("emailTemplate", new DripProperty("emailTemplate", "5d9b71f81abb5b0007117487"));
		

		AccountInformation accountInformation = new AccountInformation(
				"HxPjgrmINwB59InSqW54mr6ZdJheun9aGqLe4NZcb993dnkdSBp7M4hrKWoGU8Kd",
				"EzUWTxxJhNON7OFFxUipGBEQh0MtYwvSckVGOB64Fo6S4GDoyWGI47TrtQnNjqsW",
				"bwR9S6iCJiBK2R0BALvBN4jfnUXGS1PnyRMYekO7dlJz6acqOK0O6KUHkqQAPRBa", null, null, 9, null, "10");

		
		Map<String, Object> dripAdditionalProperties = new HashMap<>();

		CommunicationChannelCommand command = new CommunicationChannelCommand(metaData, commandInformation,
				accountInformation, source, destination, dripAdditionalProperties);

		send(DRIP_EMAIL_ADAPTER_TOPIC, command);

	}

	// "DRIP_EMAIL_ADAPTER_TOPIC"

	public static void send(String topic, Object data) {
		final String bootstrapServers = "10.170.0.100:9092";

		// Create a producer properties
		Properties properties = new Properties();
		properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
		properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaSerializer.class.getName());
		// properties.setProperty(ProducerConfig.MAX_REQUEST_SIZE_CONFIG, "1");
		// Create the producer

		@SuppressWarnings("resource")
		KafkaProducer<String, Object> producer = new KafkaProducer<String, Object>(properties);

		// Create a Record
		ProducerRecord<String, Object> record = new ProducerRecord<String, Object>(topic, data);
		// Send Data - asynchronus
		producer.send(record);

		// Flush data
		producer.flush();
		producer.close();
		System.out.println("Event Sent at: " + new Date());
	}

}
