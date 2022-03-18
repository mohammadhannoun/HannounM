package oop.full;

public class TestShape {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		
		c1.setRadius(2);
		c1.print("Circle = ");
		System.out.println(c1.calcArea());
		
		r1.setLength(5);
		r1.setWidth(6);
		r1.print("Rectangle = ");
		System.out.println(r1.calcArea());
	}
}
