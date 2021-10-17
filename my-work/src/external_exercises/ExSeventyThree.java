package external_exercises;

import java.util.Scanner;

public class ExSeventyThree {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("First String : ");
		String str1= scan.nextLine();
		System.out.print("Second String : ");
		String str2= scan.nextLine();
		char[] arr= new char[2];
		if(str1.length()>0) {
			arr[0]= str1.charAt(0);
		}
		if(str2.length()>0) {
			arr[1]= str2.charAt(str2.length()-1);
		}
		if(str1.length()==0) {
			arr[0]= '#';
		}
		if(str2.length()==0) {
			arr[1]= '#';
		}
		String sen= new String(arr);
			System.out.print(sen);
		scan.close();
	}
}
