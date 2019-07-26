package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ciudades =  Arrays.asList("Cali", "Bogotá", "Medellín",  "Cali"); 
		
		Stream<String>  stream = ciudades.stream().distinct();
		
		System.out.println(stream.findFirst());

	}

}
