package external_exercises;
import java.util.Scanner;
public class ExThree {
	public static void main(String[] args) {
		Scanner scanOne=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int n1=scanOne.nextInt();
		System.out.print("Enter the second number : ");
		int n2=scanOne.nextInt();
		int div=n1/n2;
		System.out.print("The division of the two numbers = "+div);
		scanOne.close();
	}
}
