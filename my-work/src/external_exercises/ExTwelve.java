package external_exercises;
import java.util.Scanner;
public class ExTwelve {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		double n1=scan.nextDouble();
		System.out.println("Enter the second number : ");
		double n2=scan.nextDouble();
		System.out.println("Enter teh third number : ");
		double n3=scan.nextDouble();
		double avg=(n1+n2+n3)/3;
		System.out.println("AVERAGE = "+avg);
		scan.close();
	}
}
