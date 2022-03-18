package oop.full.second.revision;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double height, double width) {
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

	public void print() {
		System.out.println("Rectangle [Height= " + height + ", Width= " + width + ", Area= " + calcArea() + "]");
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle that = (Rectangle) obj;
			return this.calcArea() == that.calcArea();
		}
		return false;
	}
}
