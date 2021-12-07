package htu.dsa;
import java.util.Scanner;
public class FactorialterativeSolution {
	//Time complexity is O(n)
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = In.nextInt();
		int factorial = 1;
			for(int i = number; i >= 2; i--) {
				factorial *= i;
			}
		System.out.println(number + "!" + " = " + factorial);
		In.close();
	}
}
