package strategy.design.pattern;

public class Main {
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		System.out.println("----------------------------------");
		
		Duck redHeadDuck = new RedHeadDuck();
		redHeadDuck.performFly();
		redHeadDuck.performQuack();
		
		System.out.println("----------------------------------");
		
		Duck rubberDuck = new RubberDuck();
		rubberDuck.performFly();
		rubberDuck.performQuack();
		
		//Duck subclasses don't have to know about the implementation details of the fly behavior.
		System.out.println("--------------Change During Runtime--------------");
		mallardDuck.setfB(new FlyWithSuperPower());
		mallardDuck.performFly();
	}

}
