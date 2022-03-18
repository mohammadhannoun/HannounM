package oop.full;

public class TestVehicle {
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		Bike b2 = new Bike();
		b1.speedUp(50);
		b1.changeGear(2);
		b1.printStates();
		b1.applyBrakes(10);
		b1.printStates();
		b1.applyBrakes(10);
		b1.changeGear(1);
		b1.printStates();
		
		b2.speedUp(120);
		b2.changeGear(4);
		b2.printStates();
		b2.applyBrakes(20);
		b2.printStates();
		b2.applyBrakes(50);
		b2.changeGear(3);
		b2.printStates();
		
		System.out.println(Vehicle.x);
	}
}
