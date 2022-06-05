package model;

import java.sql.Date;

public class Refugee {
	private String refugeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String password;
	private String birthDate;

	public Refugee() {
	}

	public Refugee(String refugeeId, String firstName, String lastName, String email, String phoneNumber,
			String password, String birthDate) {
		this.refugeeId = refugeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.birthDate = birthDate;
	}

	public String getRefugeeId() {
		return refugeeId;
	}

	public void setRefugeeId(String refugeeId) {
		this.refugeeId = refugeeId;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

}
