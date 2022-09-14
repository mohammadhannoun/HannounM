package strategy.design.pattern;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		fB = new FlyWithSuperPower();
		qB = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a RedHeadDuck!");
	}
	
}	
