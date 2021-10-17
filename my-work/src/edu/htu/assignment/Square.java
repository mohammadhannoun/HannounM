package edu.htu.assignment;
//This is a subclass
//Inherited from Shape which is the superclass
public class Square extends Shape {
	//Method override
	public void shapeArea() {
		double area;
		area= length*width;
		System.out.println("The area of the square = "+area); 
	}
}
