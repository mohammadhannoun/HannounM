package htu.dsa;
import java.util.Scanner;
public class PrimeOrNotV1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int number = scan.nextInt();
		boolean primitive = true;
			for(int i = 2; i <= number - 1; i++) {
				if(number % i == 0) {
					primitive = false;
					break;
				}
			}
		System.out.println(primitive);
		scan.close();
	}
}
