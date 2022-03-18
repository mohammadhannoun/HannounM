package section15;

public class Class_177 {
	// volatile keyword prevents the variable from getting cashed !
	volatile static int p = 0;
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					if(p == 0) {
						System.out.println("Running");
					} else {
						break;
					}
				}
			}
		}).start();
		
			new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				p += 1;
				System.out.println("The value of p has been updated !!!!!");
			}
		}).start();
	}
}
