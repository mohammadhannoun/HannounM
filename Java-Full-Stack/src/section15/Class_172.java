package section15;

public class Class_172 {
	
	/*
	 * When we try to print the value of cntr, we will notice that there is inconsistency as a result of having two threads 
	 * working along with each other and being the varibale common between each of them 
	 * The solution is --> Synchronization! 
	 */
	public static int cntr = 0;
	
	public static void main(String[] args) throws InterruptedException{
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					cntr++;
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					cntr++;
				}
			}
		});
		
		thread1.start();
		thread2.start();
		Thread.sleep(100);
		System.out.println("Cntr = " + cntr);
	}
}
