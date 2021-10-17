package external_exercises;
import java.util.Scanner;
public class EzTwo {
	public static void main(String[] args) {
		Scanner scanOne=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		double n1=scanOne.nextDouble();
		System.out.print("Enter the second number : ");
		double n2=scanOne.nextDouble();
		double sum=n1+n2;
		System.out.print("The sum of the two numbers = "+sum);
		scanOne.close();
	}
}
