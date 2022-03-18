package oop.full;

public abstract class Shape {
	
	public abstract double calcArea();
	
	public void print(String shapeName) {
		System.out.print("Shape Name : " + shapeName);
	}
}
