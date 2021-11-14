package oop.neo;

class Vehicle {
	protected String type;
	protected int speed;
	protected int seats;
		protected Vehicle(String type, int speed, int seats){
			this.type = type;
			this.speed = speed;
			this.seats = seats;
		}
		
		protected void setSpeed(int speed) {
			this.speed = speed;
		}
		
		protected void setType(String type) {
			this.type = type;
		}
		
		protected void setSeats(int seats) {
			this.seats = seats;
		}
		
		protected int getSpeedDown(int speed) {
			return (this.speed - speed);
		}
		
		protected int getSpeedUp(int speed) {
			return (this.speed + speed);
		}
}
