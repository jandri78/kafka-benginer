package pruebas;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class Main {

	public static void main(String[] args)  {
		
	}
		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder()
		  .url("http://10.170.0.106:8280/countries/v1.0/")
		  .get()
		  .build();


}
