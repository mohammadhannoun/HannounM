package oop.neo;

public class Bike extends Vehicle{	
	protected String helmet;
		protected Bike(String type, int speed, int seats, String helmet){
			super(type, speed, seats);
			this.helmet = helmet;
		}
		
	protected void setHelmet(String helmet) {
		if(helmet.equals("on")) {
			this.helmet = "on";
		} else {
			this.helmet = "off";
		}
	}
	
	protected String getHelmet() {
		return this.helmet;
	}
}
