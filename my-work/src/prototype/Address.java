package prototype;

public class Address {

	private String country;
	private String city;
	private String mobile;

	public Address() {

	}

	public Address(String country, String city, String mobile) {
		this.country = country;
		this.city = city;
		this.mobile = mobile;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", mobile=" + mobile + "]";
	}

}
