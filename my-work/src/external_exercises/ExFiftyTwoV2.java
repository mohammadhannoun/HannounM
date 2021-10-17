package external_exercises;

public class ExFiftyTwoV2 {
	public static void main(String[] args) {
		int x= ExFiftyTwo.getNumber("first");
		int y= ExFiftyTwo.getNumber("second");
		int z= ExFiftyTwo.getNumber("third");
		System.out.print("The result is : "+cond(x, y, z));
	}
	public static boolean cond(int x, int y, int z) {
		return ((x+y==z)||(x+z==y)||(y+z==x));
	}
}
