package section15;

class Thred extends Thread{
	private int threadNo;

	public Thred(int threadNo) {
		this.threadNo = threadNo;
	}

	public int getThreadNo() {
		return threadNo;
	}
	
	@Override
	public void run() {
		count();
	}
	
	public void count() {
		for(int i = 1; i <= 10; i++) {
			try {
				// .5 sec between each execution
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i = " + i + " , and the thread number = " + threadNo);
		}
	}

	@Override
	public String toString() {
		return "Thred [threadNo=" + threadNo + "]";
	}

}

public class Class_170 {

	public static void main(String[] args) throws InterruptedException{
		Thred t1 = new Thred(1);
		Thred t2 = new Thred(2);

		long startTime = System.currentTimeMillis();
		t1.start();
		System.out.println("************");
		t2.start();
		Thread.sleep(5025);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time : " + (endTime - startTime));
		
		
		
		
	}
}
