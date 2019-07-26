package hello;

public class Organization {

	private String name;
	private String address;
	private String countryName;
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

}