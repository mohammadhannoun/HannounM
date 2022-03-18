package oop.full;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle() {
		length = width = -1;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public double calcArea() {
		return (length) * (width);
	}
	
	
}
