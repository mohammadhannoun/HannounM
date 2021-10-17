package external_exercises;

public class ExFiftyFour {
	public static void main(String[] args) {
	int x= ExFiftyTwo.getNumber("FIRST");
	int y= ExFiftyTwo.getNumber("SECOND");
	int z= ExFiftyTwo.getNumber("THIRD");
	System.out.println("The result of having equal (rightmost) digit is : "+cond(x, y, z));
	}
	public static boolean cond(int x, int y, int z) {
		return (x%10==y%10)||(x%10==z%10)||(y%10==z%10);
	}
}
