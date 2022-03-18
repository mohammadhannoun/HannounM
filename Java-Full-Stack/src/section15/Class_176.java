package section15;

class Stik {
	synchronized static public void generate(int threadNo) {		
		for(int i = 10; i >= 1; i--) {
			if(i > 5) System.out.print("[");
			else System.out.print("]");
		}
		System.out.print("Generate By Thread : " + threadNo);
		System.out.println();
	}
}

public class Class_176 {
	public static void main(String[] args) {
		
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 4; i++) {
					Stik.generate(1);
				}
			}
		});
		
		Thread th2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1; i <= 4; i++) {
					Stik.generate(2);
				}
			}
		});
		
		th1.start();
		th2.start();
	}
}
