package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regtest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 String s = " 'Carlos Hernandez' <carlos.hernandez@telintel.net> ";
		    Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+").matcher(s);
		    while (m.find()) {
		        System.out.println(m.group());
		    }
		    
		    
	}

}
