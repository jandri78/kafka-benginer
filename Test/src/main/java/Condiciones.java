import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Condiciones {
	
	public static void main(String[] args) {
		String url="";
		
		if(Objects.nonNull(url) && !url.trim().isEmpty()) {
			System.out.println("tengo que validar");
		}else {
			System.out.println("NO tengo que validar");
		}
		
	    String text ="https://10.179.115.55:8443/CallbackValidationService/callbackTest";

        
	        final String regex = "^(https?:\\/\\/)?([\\da-z\\.-]+)";
	        
	       String regex2 ="( ?(https?://))?([a-zA-Z0-9\\.]+:?\\.(?=.[a-zA-Z])[^ ]+) ?";
	        
	        Pattern pattern = Pattern.compile(regex2);

	        Matcher matcher = pattern.matcher(text);
	        
	        System.out.println("matches "+matcher.matches());
	    
		
	}


        
        
        

}
