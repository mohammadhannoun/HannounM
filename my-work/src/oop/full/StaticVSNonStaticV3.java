package oop.full;

public class StaticVSNonStaticV3 {
	public void warning() {
		System.out.println("Slow Down !!! ");
	}
	public void speed(int speed) {
		if(speed >= 220) {
			warning();
		}
		System.out.println("Speed = " + speed);
		System.out.println();
	}
	public static void print() {
		System.out.println("Hello World !!");
	}
}
