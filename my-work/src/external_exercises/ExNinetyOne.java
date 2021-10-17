package external_exercises;

public class ExNinetyOne {
	public static void main(String[] args) {
		long startTime= System.nanoTime();
		System.out.println("The first ten natural numbers : ");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		long estimatedTime= System.nanoTime()- startTime;
		System.out.println("Estimated Time in nano seconds = "+estimatedTime);
	}
}
