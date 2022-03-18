package oop.full;

public class PersonRunner {
	public static void main(String[] args) {
		Person ahmad = new Person();
		ahmad.firstName = "Ahmad";
		ahmad.middleName = "Rami";
		ahmad.lastName = "Kodori";
		ahmad.age = 25;
		System.out.println("Full Name : "+ ahmad.firstName + " " + ahmad.middleName + " " + ahmad.lastName);
		System.out.println("Age : " + ahmad.age);
		System.out.println("Nationality : "+ahmad.nationality);
		System.out.println();
		
		
		Person mohammad = new Person();
		mohammad.firstName = "Mohammad";
		mohammad.middleName = "Eyad";
		mohammad.lastName = "Hannoun";
		mohammad.age = 18;
		System.out.println("Full Name : " + mohammad.firstName + " " + mohammad.middleName + " " + mohammad.lastName);
		System.out.println("Age : " + mohammad.age);
		System.out.println("Nationality : " + mohammad.nationality);		
	}
	
}
