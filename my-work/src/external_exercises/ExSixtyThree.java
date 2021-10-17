package external_exercises;

import java.util.Scanner;

public class ExSixtyThree {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the first integer : ");
		int numOne= scan.nextInt();
		System.out.print("Enter the second integer : ");
		int numTwo= scan.nextInt();
		getNumbers(numOne, numTwo);
		same(numOne, numTwo);
		scan.close();
	}
	public static void print(int x) {
		System.out.print("The result : "+x);
	}
	public static void getNumbers(int x, int y) {
	
		 if(x>y) {
			if(x%6==y%6) {
				print(y);
			}
			else if(x%6!=y%6) {
				print(x);
			}
		}
		else if(y>x) {
			if(x%6==y%6) {
				print(x);
			}
			else if(x%6!=y%6) {
				print(y);
			}
		}
	}
	public static void same(int x, int y) {
		int sub=0;
		if(x==y) {
			sub= x-y;
			print(sub);
		}
	}
	
}
