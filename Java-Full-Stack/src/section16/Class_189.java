package section16;

public class Class_189 {
	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("This is the FIRST statement!");
			System.out.println("This is the SECOND statement!");
			System.out.println("This is the THIRD statement!");
		});
		thread.start();
	}
}
