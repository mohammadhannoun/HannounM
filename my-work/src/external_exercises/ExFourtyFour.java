package external_exercises;
import java.util.Scanner;
public class ExFourtyFour {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1=scan.nextInt();
		int num2, num3;
		num2=num1*11;
		num3=num1*111;
		int sum=num1+num2+num3; 
		System.out.print(num1+" + "+num2+" + "+num3+" = "+sum);
		scan.close();
	}
}
