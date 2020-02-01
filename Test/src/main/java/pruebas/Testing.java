//package pruebas;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
////import com.telintel.services.blacklistservice.integration.dtos.BlacklistDTO;
////import com.telintel.services.go4clients.publicapigateway.products.blacklist.ServiceBlacklistDTO;
//
//public class Testing {
//
//	public String convertWithIteration(Map<String, String> map) {
//	    StringBuilder mapAsString = new StringBuilder("{");
//	    for (String key : map.keySet()) {
//	        mapAsString.append("\""+key + "\""+":" +"\""+ map.get(key)+"\"" + ",");
//	    }
//	    mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");
//	    return mapAsString.toString();
//	    }
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Map<String, String> wordsByKey = new HashMap<String, String>();
//		wordsByKey.put("PROGRAM_ID","5ce3faeae9b9fa0007e9b093");
//		wordsByKey.put("ORGANIZATION_ID","5c9e8c912ce261000826010e");
//		
//		
//		System.out.println(wordsByKey.toString());
//		
//		System.out.println();
//		
//		Testing t = new Testing();
//		System.out.println(t.convertWithIteration(wordsByKey));
//		
//		
//	
//		
//		
////		public List<ServiceBlacklistDTO> serviceBlacklistConverter(List<BlacklistDTO> blacklistDTOIn) {
////
////			List<ServiceBlacklistDTO> ServiceBlacklistDTOList = new ArrayList<ServiceBlacklistDTO>();
////
////			for (BlacklistDTO blacklistDTO : blacklistDTOIn) {
////				ServiceBlacklistDTO serviceBlacklistDTObj = new ServiceBlacklistDTO();
////				serviceBlacklistDTObj.setBlacklistId(blacklistDTO.getId());
////				serviceBlacklistDTObj.setProgramId(blacklistDTO.getProgramId());
////				serviceBlacklistDTObj.setProgramName(blacklistDTO.getProgram());
////				serviceBlacklistDTObj.setNumber(blacklistDTO.getKey());
////				serviceBlacklistDTObj.setService(blacklistDTO.getService());
////				serviceBlacklistDTObj.setStatus(blacklistDTO.getStatus());
////				serviceBlacklistDTObj.setCreatedOn(blacklistDTO.getCreatedOn());
////				ServiceBlacklistDTOList.add(serviceBlacklistDTObj);
////			}
////
////			return ServiceBlacklistDTOList;
////		}
////		
////	}
//
//	
//	
//}
