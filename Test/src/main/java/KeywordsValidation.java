import java.util.ArrayList;

import com.telintel.services.provisioning.integration.dtos.KeywordDTO;
import com.telintel.services.provisioning.integration.entities.Code;
import com.telintel.services.provisioning.integration.types.KeywordStatus;

public class KeywordsValidation {
	
	private static Code code;
	
	public static void main(String[] args) {
		
		code = new Code();
		code.setKeywordList(new ArrayList<KeywordDTO>());
		KeywordDTO a=new KeywordDTO();
		a.setKeyword("dev111");
		a.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO b=new KeywordDTO();
		b.setKeyword("tatiana");
		b.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO c=new KeywordDTO();
		c.setKeyword("hola");
		c.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO d=new KeywordDTO();
		d.setKeyword("alto");
		d.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO e=new KeywordDTO();
		e.setKeyword("autolp");
		e.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO f=new KeywordDTO();
		f.setKeyword("autolp2");
		f.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO g=new KeywordDTO();
		g.setKeyword("Tatiana LDPTest");
		g.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO h=new KeywordDTO();
		h.setKeyword("Tatiana 2019");
		h.setKeywordStatus(KeywordStatus.ACTIVE);
		KeywordDTO t=new KeywordDTO();
		t.setKeyword("Tatiana 2019 1");
		t.setKeywordStatus(KeywordStatus.ACTIVE);
		
		code.getKeywordList().add(a);
		code.getKeywordList().add(b);
		code.getKeywordList().add(c);
		code.getKeywordList().add(d);
		code.getKeywordList().add(e);
		code.getKeywordList().add(f);
		code.getKeywordList().add(g);
		code.getKeywordList().add(h);
		code.getKeywordList().add(t);
		System.out.println(validate("hola"));
//		System.out.println(validate("TATIANA"));
//		System.out.println(validate("AUTOLP"));
//		System.out.println(validate("CrIStIAN AcUmUlAdO hola como estas"));
//		
	}
	
	public static KeywordDTO validate(String message) {
		KeywordDTO keyword = null;
		int weight = 0;
//		for (KeywordDTO key : code.getKeywordList()) {
//			if (!key.getKeywordStatus().equals(KeywordStatus.DELETED)
//					&& !key.getKeywordStatus().equals(KeywordStatus.PENDING)
//					&& text.toUpperCase().startsWith(key.getKeyword().toUpperCase())) {
//				if (weight == 0 || key.getKeyword().length() > weight) {
//					weight=key.getKeyword().length();
//					response = key.getKeyword();
//				}
//			}
//		}
		for (KeywordDTO key : code.getKeywordList()) {
			if (key.getKeywordStatus().equals(KeywordStatus.ACTIVE)
					&& message.toUpperCase().startsWith(key.getKeyword().toUpperCase())) {
				if (weight == 0 || key.getKeyword().length() > weight) {
					weight=key.getKeyword().length();
					keyword = key;
				}
			}
		}
		
		return keyword;
	}

}


