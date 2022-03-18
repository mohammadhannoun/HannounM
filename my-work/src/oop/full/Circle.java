package oop.full;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		radius = -1;
	} 
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return (Math.PI) * (Math.pow(radius, 2));
	}
	
}
