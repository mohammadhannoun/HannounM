package oop.neo;

public class Student {
	String name;
	int age; 
	String address;
	//constructor
	// this --> A keyword means the current object
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;  
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
}
