package oop.full;

public class StaticVSNonStaticV4 {
	public static void main(String[] args) {
		StaticVSNonStaticV3 audi = new StaticVSNonStaticV3();
		audi.speed(250);
		audi.speed(160);
		
		StaticVSNonStaticV3 kia = new StaticVSNonStaticV3();
		kia.speed(500);
		
		StaticVSNonStaticV3.print();
	}
}
