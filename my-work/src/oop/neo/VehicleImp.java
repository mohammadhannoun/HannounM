package oop.neo;

public class VehicleImp {
	public static void main(String[] args) {
		Bike bike = new Bike("Mercedes", 220, 4, "no");
		System.out.println(bike.speed);
		System.out.println(bike.seats);
		System.out.println(bike.getSpeedDown(100));
		System.out.println(bike.getSpeedUp(170));
	}
}
