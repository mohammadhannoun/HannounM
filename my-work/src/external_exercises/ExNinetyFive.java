package external_exercises;
import java.util.Arrays;
import java.util.Scanner;
public class ExNinetyFive {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n= scan.nextInt();
		String[] numbers= new String[n];
		for(int i=0; i<n; i++) {
			numbers[i]= String.valueOf(i);
		}
		System.out.println("New array : "+Arrays.toString(numbers));
		scan.close();
	}
}
