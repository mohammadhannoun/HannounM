package uml;

public class Address {
	private String city;
	private String country;
	private String mobile;
	
	public Address() {
		
	}
	
	public Address(String city, String country, String mobile) {
		this.city = city;
		this.country = country;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", mobile=" + mobile + "]";
	}
	
}
