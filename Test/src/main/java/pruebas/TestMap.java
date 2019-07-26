package pruebas;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		String json = "{\"name\":\"mkyong\", \"age\":\"37\"}";
		String a = "{\"PROGRAM_ID\":\"5ce3faeae9b9fa0007e9b093\"}";

		try {

			// convert JSON string to Map
			Map<String, String> map = mapper.readValue(a, Map.class);

			// it works
			// Map<String, String> map = mapper.readValue(json, new
			// TypeReference<Map<String, String>>() {});

			System.out.println(map.get("PROGRAM_ID"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
