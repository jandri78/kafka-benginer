package anidados;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Signup API information")
public class SignupApiDTO {

	@ApiModelProperty(notes = "Organization information")
	private Organization organization;
	
	public SignupApiDTO() {
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return "SignupApiDTO [organization=" + organization + "]";
	}

	class Organization {
		
		public Organization() {
		}

		@ApiModelProperty(notes = "Organization's name")
		private String name;
		@ApiModelProperty(notes = "Organization's address")
		private String address;
		@ApiModelProperty(notes = "Organization's country name")
		private String countryName;
		@ApiModelProperty(notes = "Organization's user")
		private User user;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCountryName() {
			return countryName;
		}

		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@Override
		public String toString() {
			return "Organization [name=" + name + ", address=" + address + ", countryName=" + countryName + ", user="
					+ user + "]";
		}

		class User {
			
			public User() {
			}

			@ApiModelProperty(notes = "User's first name")
			private String firstName;
			@ApiModelProperty(notes = "User's last name")
			private String lastName;
			@ApiModelProperty(notes = "User's mobile number")
			private String mobileNumber;
			@ApiModelProperty(notes = "User's email")
			private String email;
			@ApiModelProperty(notes = "User's timezone")
			private String timezone;
			@ApiModelProperty(notes = "User's timezone")
			private String password;

			public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}

			public String getMobileNumber() {
				return mobileNumber;
			}

			public void setMobileNumber(String mobileNumber) {
				this.mobileNumber = mobileNumber;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getTimezone() {
				return timezone;
			}

			public void setTimezone(String timezone) {
				this.timezone = timezone;
			}
			
			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			@Override
			public String toString() {
				return "User [firstName=" + firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
						+ ", email=" + email + ", timezone=" + timezone + ", password=" + password + "]";
			}

		}

	}



	

}
