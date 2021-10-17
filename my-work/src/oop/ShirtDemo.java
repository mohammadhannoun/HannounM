package oop;

public class ShirtDemo {
	public static void main(String[] args) {
		Shirt s= new Shirt("Red", 'L');
			System.out.println(s.color);
			System.out.println(s.size);
		Shirt d= new Shirt("White", 'S');
			System.out.println(d.color);
			System.out.println(d.size);
		Shirt t= new Shirt("", ' ');
			t.setColor("Blue");
			t.setSize('M');
	}
}
