package anidados;

import com.google.gson.Gson;

import anidados.SignupApiDTO.Organization;
import anidados.SignupApiDTO.Organization.User;

public class TestCopper {
	public static void main(String[] args) {
		CopperIntegrationDTO copper = new CopperIntegrationDTO("myName", "myCustomerSourceId", "myAssignedId",
				"myCompanyName");
		copper.setEmail(copper.new Email("myEmail", "myCategory"));
		copper.addPhoneNumber(copper.new PhoneNumber("myNumber", "myCategory"));
		copper.addCustomField(copper.new CustomField("myCustomFieldDefinitionId", "myValue"));
		copper.addCustomField(copper.new CustomField("myCustomFieldDefinitionId2", "myValue2"));

		Gson gson = new Gson();
		String json=gson.toJson(copper);
		System.out.println(json);
		
		 
		
		SignupApiDTO signupApiDTO = new SignupApiDTO();
		
		Organization organizationHeredada = signupApiDTO.new Organization();
		organizationHeredada.setName("");
		organizationHeredada.setAddress("");
		organizationHeredada.setCountryName("");
		
		User userHeredado = organizationHeredada.new User();
		userHeredado.setFirstName("");
		userHeredado.setLastName("");
		userHeredado.setMobileNumber("");
		userHeredado.setEmail("");
		userHeredado.setTimezone("");
		userHeredado.setPassword("");
		organizationHeredada.setUser(userHeredado);
		signupApiDTO.setOrganization(organizationHeredada);
		
		
	}
}
