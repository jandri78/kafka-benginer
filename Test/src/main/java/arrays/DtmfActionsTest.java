package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.swagger.models.auth.In;

public class DtmfActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DTMFAction dtm1 = new DTMFAction();
		dtm1.setDtmf("2");
		dtm1.setStepId("1");
		dtm1.setLevel(1);
		
		DTMFAction dtm2 = new DTMFAction();
		dtm2.setDtmf("0");
		dtm2.setStepId("2");
		dtm2.setLevel(2);
		
		DTMFAction dtm3 = new DTMFAction();
		dtm3.setDtmf("3");
		dtm3.setStepId("2");
		dtm3.setLevel(2);
		
		DTMFAction dtm4 = new DTMFAction();
		dtm4.setDtmf("0");
		dtm4.setStepId("3");
		dtm4.setLevel(3);
		
		DTMFAction dtm5 = new DTMFAction();
		dtm5.setDtmf("1");
		dtm5.setStepId("3");
		dtm5.setLevel(3);
		
		List<DTMFAction> listaDtmf = new ArrayList<DTMFAction>();
		listaDtmf.add(dtm1);
		listaDtmf.add(dtm2);
		listaDtmf.add(dtm3);
		listaDtmf.add(dtm4);
		listaDtmf.add(dtm5);
		
		System.out.println(listaDtmf.toString());
		System.out.println("####################");
		Map<String, String> result = new LinkedHashMap<>();
		
		List<Integer> levellist = new ArrayList<Integer>();
		
		for (DTMFAction action : listaDtmf) {

			String header = "Dial pressed on level: " + action.getLevel();
			// add header
			
			result.put(header, action.getDtmf());

//			if (!result.containsKey(header)) {
//				result.put(header, action.getDtmf());
//			} 
			

		}
		
		System.out.println(result.toString());
		
		
	}

}
