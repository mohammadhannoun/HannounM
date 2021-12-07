package htu.dsa;

public class FactorialRecursiveSolution {
	//Time complexity is O(n)
	public static void main(String[] args) {
		System.out.println("0!" + " = " + factorial(0));
	}
	public static int factorial(int number) {
		if(number == 0) return 1;
		
		return (number * factorial(number - 1));
	}
}
