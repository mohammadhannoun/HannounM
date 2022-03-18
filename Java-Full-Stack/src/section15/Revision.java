package section15;

class Pattern {
	private Object lock = "lock";
	 public void printPattern() {
		 synchronized (lock) {
			 for(int i = 1; i <= 10; i++) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 	if(i <= 5) System.out.print("[");
					else System.out.print("]");
				}
				System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Revision {
	public static void main(String[] args) {
		Pattern p1 = new Pattern();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 1; i <= 3; i++) {
					p1.printPattern();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread 1 total time = " + (endTime - startTime));
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 1; i <= 3; i++) {
					p1.printPattern();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread 2 total time = " + (endTime - startTime));
			}
		});
		
		t1.start();
		t2.start();
	}
}
