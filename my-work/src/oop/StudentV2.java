package oop;
//Inheritance : key word (extends)
public class StudentV2 extends PersonV3 {
	double gpa;
	//method override
	public void sayHello() {
		System.out.println("Hello my name is "+name+" and my age is "+age+" and my GPA is : "+gpa);
	}
}
