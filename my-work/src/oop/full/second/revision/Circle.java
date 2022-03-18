package oop.full.second.revision;

public class Circle extends Shape{
	private double radius;
	private static final double PI = 3.14;
	
	public Circle() {
		
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
		return radius * radius * PI;
	}
	
	public void print() {
		System.out.println("Circle [PI= " + PI + ", Radius= " + radius + ", Area= " + calcArea() + "]");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle that = (Circle) obj;
			return this.calcArea() == that.calcArea();
		}
		return false;
	}
}
