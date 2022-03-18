package section15;

class Bracket {
	//Synchronization blocks other thread from accessing the method while another thread is using it.
	synchronized public void print() {
		for(int i = 1; i <= 10; i++) {
			if(i <= 5) System.out.print("[");
			else System.out.print("]");
		}
		System.out.println();
	}
}

public class Class_173 {
	public static void main(String[] args) throws InterruptedException{
		Bracket b1 = new Bracket();

		new Thread(new Runnable() {
				@Override
			public void run() {
				for(int i = 0; i <= 4; i++) {
				b1.print();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i <= 4; i++) {
				b1.print();
				}
			}
		}).start();
		
	}
}
