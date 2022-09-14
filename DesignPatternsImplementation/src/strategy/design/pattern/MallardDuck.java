package strategy.design.pattern;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		fB = new FlyWithWings();
		qB = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I am a MallardDuck!");
	}
}
