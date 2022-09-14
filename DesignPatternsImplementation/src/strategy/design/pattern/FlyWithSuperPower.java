package strategy.design.pattern;

public class FlyWithSuperPower implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I will fly with power!");	
	}
}
