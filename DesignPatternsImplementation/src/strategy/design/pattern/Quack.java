package strategy.design.pattern;

public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("I can quack!");	
	}
}
