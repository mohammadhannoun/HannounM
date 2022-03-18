package oop.full.revision;

public class TestVehicle {
	public static void main(String[] args) {
		Bicycle c1 = new Bicycle(20, 1);
		Bike b1 = new Bike(150, 4);
		c1.printState();
		c1.applyBreaks(10);
		c1.changeGear(4);
		c1.speedUp(110);
		c1.printState();
		b1.printState();
		b1.applyBreaks(60);
		b1.changeGear(3);
		b1.printState();
		b1.speedUp(62);
		b1.changeGear(5);
		b1.printState();
		System.out.println("This instance Variable is 1- public, 2- static, 3- final --> x = " + Vehicle.x);
	}
}
