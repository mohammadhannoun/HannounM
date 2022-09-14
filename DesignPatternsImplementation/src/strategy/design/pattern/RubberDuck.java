package strategy.design.pattern;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		fB = new NoFly();
		qB = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("I am a RubberDuck!");
	}
	
}
