import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

public class Main {

	
	private static final String DATE_FORMAT_NO_TIMEZONE = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	private static final String DATE_FORMAT_NO_TIMEZONE2 = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> searchFilters = new HashMap<String, String>();
		
		searchFilters.put("name", "Andres");
		searchFilters.put("correo", "jandri78");
		
		String s = "SALES:0";
		String[] pairs = s.split(",");
		
		for (int i=0;i<pairs.length;i++) {
		    String pair = pairs[i];
		    String[] keyValue = pair.split(":");
		    searchFilters.put(keyValue[0], keyValue[1]);
		}
		//System.out.println(searchFilters);
		
		Date objDate = new Date();
		
		
		SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT_NO_TIMEZONE2);
		System.out.println(df.format(objDate));
		

		DecimalFormat formateador = new DecimalFormat("####.###");
		// Imprime esto con cuatro decimales, es decir: 7,1234
		System.out.println (formateador.format (7.12342383));
		
		
		String a = "https://devleoshop.myshopify.com";
		
		String reemplazo = a.replace("https://", "");
		
		System.out.println(a+" ---> "+reemplazo);

	}

}
