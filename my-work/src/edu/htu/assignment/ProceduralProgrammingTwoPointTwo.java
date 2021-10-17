package edu.htu.assignment;

import javax.swing.JOptionPane;

public class ProceduralProgrammingTwoPointTwo {
	//Declaring a global variable called sideLength as double
	static double sideLength;
	public static void main(String[] args) {
	//Getting user's input as a string
	String sideInput= JOptionPane.showInputDialog("Enter the length of the square's side: ");
	//converting user's input from a String into a double
	sideLength= Double.parseDouble(sideInput);
	//Calling print method
	print();
	//Creating a method to calculate the area of a square, that return a result from type double
	print("Your square is blue");
	}public static double squareArea() {
	//Declaring a variable called squareArea as a double 
	 Double squareArea;
	 //Calculating the square of the square
	 squareArea= sideLength*sideLength;
	 //Returning the value of squareArea
	 		return squareArea;
	 //Creating a method to get the returned value from the squareArea method and keeping it in a new variable, and then print it
	}public static void print() {
	 double area= squareArea();
	 System.out.println("The area of the square = "+area);
	 }public static void print(String message) {
		 System.out.println(message);
	 }
}

