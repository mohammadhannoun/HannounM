package oop;

public class Inheritance {
	public static void main(String[] args) {
		PersonV3 p1=new PersonV3();
		p1.name= "Mohmmad";
		p1.age= 18;
		p1.sayHello();
		p1.sayHello("WEWE");
		StudentV2 s1= new StudentV2();
		s1.name= "Mohmmad";
		s1.age= 18;
		s1.gpa= 3.7;
		s1.sayHello();
	}
}
