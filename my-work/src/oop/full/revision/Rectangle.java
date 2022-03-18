package oop.full.revision;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle() {
		height = -1;
		width = -2;
	}
	
	public Rectangle(int height, int width) {
		setHeight(height);
		setWidth(width);
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double calcArea() {
		return height * width;
	}

	@Override
	public void print() {
		System.out.println("Rectangle Area = " + calcArea());
	}
	
	
}
