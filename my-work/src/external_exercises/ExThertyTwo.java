package external_exercises;
import java.util.Scanner;
public class ExThertyTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number : ");
		double n1=scan.nextDouble();
		System.out.print("Enter the second number : ");
		double n2=scan.nextDouble();
		if(n1!=n2) {
			System.out.println(n1+" != "+n2);
		}
		else {
			System.out.println(n1+" = "+n2);
		}
		if(n1>n2) {
			System.out.println(n1+" > "+n2);
		}
		else if(n1<n2) {
			System.out.println(n1+" < "+n2);
		}
		scan.close();	
	}
}
