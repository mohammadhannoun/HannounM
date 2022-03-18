package oop.full.second.revision;

public class TestShape {
	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(3);
		Circle c3 = new Circle(5);
		
		System.out.println(c1.equals(c3) ? "Equal" : "Not Equal");
		c2.print();
		
		Rectangle r1 = new Rectangle(5, 5);
		r1.print();
		Rectangle r2 = new Rectangle(5, 5);
		System.out.println(r1.equals(r2) ? "Equal" : "Not Equal");
		
		Rectangle r3 = new Rectangle();
		r3.setHeight(4);
		r3.setWidth(7);
		System.out.println(r3.calcArea());
	}
}
