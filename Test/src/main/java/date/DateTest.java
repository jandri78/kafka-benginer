package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class DateTest {
	
	public static final String DATE_QUERY_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
	
	
	enum priceRuleValueType{
		fixed_amount,percentage
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();  
		
		SimpleDateFormat formatter = new SimpleDateFormat(DATE_QUERY_FORMAT);
		
	    String strDate= formatter.format(date);  

		System.out.println(strDate);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");  
	    try {  
	        Date date3 = formatter2.parse("31/03/2015");  
	        System.out.println("Date is: "+date3);  
	    } catch (Exception e) {e.printStackTrace();}  
	    
	    
	    Map<String, String> searchFilters;
	    
	    SimpleDateFormat format = new SimpleDateFormat(DATE_QUERY_FORMAT);
	    try {
			System.out.println("formate -- "+format.parse("2019-10-24T15:00:00"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    System.out.println(date);
	    
	    System.out.println(priceRuleValueType.fixed_amount.name());
	    
	    int a= -101;
	    
	    if (a <= -100 || a >0 ) {
			System.out.println("error");
		}else {
			System.out.println("ok");
		}
	    
	}

}
