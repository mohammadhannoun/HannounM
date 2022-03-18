package oop.full;

public class StaticVSNonStaticV2 {
	public static void main(String[] args) {
		StaticVSNonStaticV2 audi = new StaticVSNonStaticV2();
		audi.speed(180);
		audi.speed(290);
		StaticVSNonStaticV2 kia = new StaticVSNonStaticV2();
		kia.speed(120);
		kia.speed(220);
		
	}
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
}
