package oop.full;

public class StaticVSNonStatic {
	public static void main(String[] args) {
		myStaticMethod();
		
		System.out.println();
		
		StaticVSNonStatic non = new StaticVSNonStatic();
		non.myNonStaticMethod();
	}
	public static void myStaticMethod() { //Static --> Can be accessed without creating an object
		System.out.println("Hello World ! ");
	}
	public void myNonStaticMethod() { // NonStatic --> Can only be accessed with object
		System.out.println("Hello World ! ");
	}
}
