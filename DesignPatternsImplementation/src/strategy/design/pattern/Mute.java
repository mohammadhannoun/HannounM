package strategy.design.pattern;

public class Mute implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("I am muted!");	
	}
}
