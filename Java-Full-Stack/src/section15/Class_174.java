package section15;

class Bar {
	/*
	 * Synchronized method means all of the contents of it are sychronized (More Time), but when there is a need for being 
	 * a part of synchronized, we can use the synchonizd block (Less Time)
	 */
	
	
	/*synchronized public void printy() {
			
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
			System.out.println();*/
	
	private Object lock = "lock";
	 public void printy() {
		 //this means this block
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
		
		for(int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Class_174 {
	public static void main(String[] args) {
		Bar b1 = new Bar();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 0; i <= 4; i++) {
					b1.printy();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread 1 Total Time : " + (endTime-startTime));
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i = 0; i <= 4; i++) {
					b1.printy();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread 2 Total Time : " + (endTime-startTime));
			}
		}).start();
		
		
	}
}
