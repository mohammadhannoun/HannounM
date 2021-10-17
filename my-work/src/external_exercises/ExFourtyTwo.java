package external_exercises;
import java.util.Scanner;
public class ExFourtyTwo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your password : ");
		String password=scan.nextLine();
		System.out.print("Your password was : "+password);
		scan.close();
	}
}
