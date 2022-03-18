package section15;

import java.util.Random;

class Cntr implements Runnable {
	private int threadNo;

	public Cntr(int threadNo) {
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i = " + i + " , thread number = " + threadNo);
		}
	}	
}

public class Class_171 {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * There are two ways of using the runnable class to create a thread.
		 */
		
		/*Thread thread1 = new Thread(new Cntr(1));
		Thread thread2 = new Thread(new Cntr(2));
		
		thread1.start();
		thread2.start();*/
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 8; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		}).start();;
	}
}
