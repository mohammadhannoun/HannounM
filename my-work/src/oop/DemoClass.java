package oop;

public class DemoClass {
	public static void main(String[] args) {
		//Declaring a reference from type Person 
		//Constructing an object
		Person p1= new Person();
		Person p2= new Person();
		//Calling the instance variables or methods depending on a reference
		p1.name ="Mohmmad Hannoun";
		p2.name ="Rola";
		p1.age =18;
		p2.age =64;
		p1.sayHello();
		p2.sayHello();
	}
}
