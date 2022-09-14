package strategy.design.pattern;

public class Duck {
	
	FlyBehavior fB;
	QuackBehavior qB;
	
	public void swim () {
		System.out.println("I can swim!");
	}
	
	//Abstract method that will be overriden by other subclasses
	public void display() {};
	
	public void performFly() {
		fB.fly();
	}
	
	public void performQuack() {
		qB.quack();
	}

	public void setfB(FlyBehavior fB) {
		this.fB = fB;
	}

	public void setqB(QuackBehavior qB) {
		this.qB = qB;
	}
	
	
}
