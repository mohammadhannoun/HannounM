package external_exercises;

public class ExFiftySix {
	public static void main(String[] args) {
		int x= ExFiftyTwo.getNumber("First");
		int y= ExFiftyTwo.getNumber("Second");
		int z= ExFiftyTwo.getNumber("Third");
		int counter= 0;
		for(int i=x; i<=y; i++) {
			if(i%z==0) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
