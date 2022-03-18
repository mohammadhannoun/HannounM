package oop.full.revision;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		radius = -1;
	}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public void print() {
		System.out.println("Circle Area = " + calcArea());
	}
	
	
}
