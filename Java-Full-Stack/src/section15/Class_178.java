package section15;

public class Class_178 {
	static int balance = 0;
	public static void main(String[] args) {
		Class_178 c1 = new Class_178();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Withdraw is in process, please wait!!");
				c1.withdraw(500);
			}
		}).start();
		
			new Thread(new Runnable() {		
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Depositing is in progress, please wait!!");
				c1.deposit(1800);
				
			}
		}).start();
	}
	
	public void withdraw(int amount) {
		
		synchronized (this) {
			if(balance <= 0) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			balance -= amount;
			System.out.println("You have successfully withdrew : " + amount + "$");
			System.out.println("Current Balance = " + balance);
		}
	} public void deposit(int amount) {
		System.out.println("We are depositing " + amount + "$");
		balance += amount;
		synchronized (this) {
			notify();
		}
	}
}
