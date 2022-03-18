package oop.full.revision;

public class Bike implements Vehicle{
	private int speed;
	private int gear;
	
	public Bike() {
		
	}
	
	public Bike(int speed, int gear) {
		setSpeed(speed);
		setGear(gear);
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	@Override
	public void changeGear(int newGear) {
		setGear(newGear);
	}

	@Override
	public void speedUp(int increment) {
		setSpeed((getSpeed() + increment));
	}

	@Override
	public void applyBreaks(int decrement) {
		setSpeed((getSpeed() - decrement));
	}
	
	public void printState() {
		System.out.println("Bike [speed=" + speed + ", gear=" + gear + "]");
	}
}
