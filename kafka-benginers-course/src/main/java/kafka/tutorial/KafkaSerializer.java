package kafka.tutorial;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * Kafka serializer
 *
 * @author david.cadena
 *
 */
public class KafkaSerializer implements Serializer<Object> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
// TODO Auto-generated method stub

	}

	@Override
	public byte[] serialize(String topic, Object data) {
		byte[] response = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			response = objectMapper.writeValueAsString(data).getBytes();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public void close() {
// TODO Auto-generated method stub

	}

}