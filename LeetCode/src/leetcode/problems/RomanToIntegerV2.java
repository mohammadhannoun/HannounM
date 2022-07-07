package leetcode.problems;

import java.util.Scanner;

public class RomanToIntegerV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Write the Roman Numeral : ");
		String s= scan.nextLine();
		int x= romanToInt(s);
			System.out.println(x);
			scan.close();
	}
	public static int num(char x) {
		switch (x) {
		case 'I': return 1;
		case 'V': return 5;
		case 'X': return 10;
		case 'L': return 50;
		case 'C': return 100;
		case 'D': return 500;
		case 'M': return 1000;
		default : return 0;
		}
	}
	public static int romanToInt(String s) {
		char[] ch= s.toCharArray();
		int sum= 0;
		int temp= 0;
			for(int i=0; i<ch.length; i++) {
					sum += num(s.charAt(i));
					temp= num(s.charAt(i));
					if(i<s.length()-1) {
						if(num(s.charAt(i))<num(s.charAt(i+1))) {
						sum -= temp;
						sum += num(s.charAt(i+1))-num(s.charAt(i)); 
						i++;
						}
					}
				}
			return sum;
	}
}
