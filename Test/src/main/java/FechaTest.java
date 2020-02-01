import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class FechaTest {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = simpleDateFormat.parse("12-01-2018");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		
		UUID uuid = UUID.randomUUID();
		int variant = uuid.variant();
		int version = uuid.version();
		
		System.out.println(uuid);
		System.out.println(variant);
		System.out.println(version);
		
		
		MessageDigest salt = MessageDigest.getInstance("SHA-256");
		salt.update(UUID.randomUUID().toString().getBytes("UTF-8"));
		String digest = bytesToHex(salt.digest());
		
		System.out.println(digest);
		
	}

	   private static String bytesToHex(byte[] hashInBytes) {

	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < hashInBytes.length; i++) {
	            sb.append(Integer.toString((hashInBytes[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        return sb.toString();

	    }
}
