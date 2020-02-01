package arrays;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ExcelEvaulate {

	   public static void main(String[] args) {
		   Double a = 2.0E-4;
		   DecimalFormat dfmt = new DecimalFormat("#.####");
		   
	   if (a==0.0002) {
			System.out.println("oks");
		}
		   String number = dfmt.format(a);
		   
		   
		   System.out.println(a);
		   System.out.println(a*(Math.pow(10, 1)));
		   
		   System.out.println(Double.parseDouble(number.replaceAll(",", "."))); 
	
		   System.out.println(number);

  	   
	
	
	   }
	   
}
