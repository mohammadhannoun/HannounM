package edu.htu.assignment;

public class OOPExecution {
	public static void main(String[] args) {
	//Declaring a variable (reference) as Square type
	//Constructing an object
		Square s1= new Square();
		s1.length= 5;
		s1.width= 5;
		s1.shapeArea();
		//Declaring a variable (reference) as RightTriangle type
		//Constructing an object
		RightTriangle t1= new RightTriangle();
		t1.length= 3;
		t1.width= 4;
		t1.shapeArea();
	}
}
