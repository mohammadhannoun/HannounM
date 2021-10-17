package classesexamples;
import java.util.Scanner;
public class ExTwo {
	public static void main (String[] args) {
		System.out.println("Enter three numbers!");
		System.out.println(" ");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int n1 = s.nextInt();
		System.out.print("Enter the second number : ");
		int n2 = s.nextInt();
		System.out.print("Enter the third number : ");
		int n3 = s.nextInt();
		int n4 = (n1+n2+n3)/3;
		System.out.println("The average is = "+n4);
		s.close();
		
	}

}
