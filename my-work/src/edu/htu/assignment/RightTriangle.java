package edu.htu.assignment;
//This is a subclass
//Inherited from Shape which is the superclass
public class RightTriangle extends Shape {
	//Method override
	public void shapeArea() {
		double area;
		area= (0.5*length*width);
		System.out.print("The area of the right triangle = "+area);
	}
}