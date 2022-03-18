package oop.full;

public class MainTwo {
	public static void main(String[] args) {
		MainOne firstObject = new MainOne();
		MainOne secondObject = new MainOne();
		MainOne thirdObject = new MainOne();
		MainOne fourthObject = new MainOne();
		System.out.println(firstObject.x);
		System.out.println(secondObject.x);
		System.out.println(thirdObject.x);
		System.out.println(fourthObject.x);
		firstObject.y = 60; // Setting a new value
		System.out.println(firstObject.y);
		firstObject.x = 75; //Overriding existing value
		System.out.println(firstObject.x);
		System.out.println(secondObject.x);
		System.out.println(secondObject.y);
		System.out.println(firstObject.z);
		
	}
}
