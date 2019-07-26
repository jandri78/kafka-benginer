package anidados;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CopperIntegrationDTO {

	private String name;
	@SerializedName("customer_source_id")
	private String customerSourceId;
	@SerializedName("assigned_id")
	private String assignedId;
	@SerializedName("company_name")
	private String companyName;
	private Email email;
	@SerializedName("phone_numbers")
	private List<PhoneNumber> phoneNumbers;
	@SerializedName("custom_fields")
	private List<CustomField> customFields;

	public CopperIntegrationDTO(String name, String customerSourceId, String assignedId, String companyName) {
		this.name = name;
		this.customerSourceId = customerSourceId;
		this.assignedId = assignedId;
		this.companyName = companyName;
		this.phoneNumbers = new ArrayList<CopperIntegrationDTO.PhoneNumber>();
		this.customFields = new ArrayList<CopperIntegrationDTO.CustomField>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerSourceId() {
		return customerSourceId;
	}

	public void setCustomerSourceId(String customerSourceId) {
		this.customerSourceId = customerSourceId;
	}

	public String getAssignedId() {
		return assignedId;
	}

	public void setAssignedId(String assignedId) {
		this.assignedId = assignedId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public void addPhoneNumber(PhoneNumber phoneNumber) {
		phoneNumbers.add(phoneNumber);
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public void addCustomField(CustomField customField) {
		this.customFields.add(customField);
	}

	public List<CustomField> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(List<CustomField> customFields) {
		this.customFields = customFields;
	}

	@Override
	public String toString() {
		return "CopperIntegrationDTO [name=" + name + ", customerSourceId=" + customerSourceId + ", assignedId="
				+ assignedId + ", companyName=" + companyName + ", email=" + email + ", phoneNumbers=" + phoneNumbers
				+ ", customFields=" + customFields + "]";
	}

	class Email {
		private String email;
		private String category;

		public Email(String email, String category) {
			this.email = email;
			this.category = category;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "Email [email=" + email + ", category=" + category + "]";
		}

	}

	class PhoneNumber {
		private String number;
		private String category;

		public PhoneNumber(String number, String category) {
			this.number = number;
			this.category = category;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "PhoneNumber [number=" + number + ", category=" + category + "]";
		}

	}

	class CustomField {
		@SerializedName("custom_field_definition_id")
		private String customFieldDefinitionId;
		private String value;

		public CustomField(String customFieldDefinitionId, String value) {
			this.customFieldDefinitionId = customFieldDefinitionId;
			this.value = value;
		}

		public String getCustomFieldDefinitionId() {
			return customFieldDefinitionId;
		}

		public void setCustomFieldDefinitionId(String customFieldDefinitionId) {
			this.customFieldDefinitionId = customFieldDefinitionId;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "CustomField [customFieldDefinitionId=" + customFieldDefinitionId + ", value=" + value + "]";
		}

	}

}