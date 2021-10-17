package oop;

public class PersonV3 {
	String name;
	int age;
	
	public void sayHello() {
		System.out.println("Hello my name is "+name+" and my age is "+age+" .");
	}
	//method overload
	public void sayHello(String msg) {
		System.out.println(msg+"Hello");
	}
}
