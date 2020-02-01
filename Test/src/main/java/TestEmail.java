import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class TestEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		String emails = "jandri78@gmail.com,jorge.perez@telintel.net,koko@gmail.com    ,ads@gma.com";
		
		List<String> emailList = Arrays.asList(emails.split(","));
		
		for (String email : emailList) {
			if (!email.isEmpty()) {
//				String imprimir = email.trim().replaceAll("\\s", "");
//				String mail = email.trim();
//				System.out.println(mail);
			}
			
		}
		TestEmail te = new TestEmail();
		String a = te.emailformatter(emails);
		
		System.out.println(a);
		
		
	}

	private String emailformatter(String emails) {

		List<String> emailResult = new ArrayList<String>();

		List<String> emailList = Arrays.asList(emails.split(","));
		for (String email : emailList) {
			String mail = email.trim().replaceAll("\\s", email);
			emailResult.add(mail);
		
		}
		return emailResult.toString().replaceAll("(\\[|\\])", "");
	}
		 
}
