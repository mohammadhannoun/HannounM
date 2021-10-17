package leetcode.problems;

import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Write the Roman Numeral : ");
		String s= scan.nextLine();
		int x= romanToInt(s);
			System.out.println(x);
			scan.close();
	}
	public static int num(int x) {
		if(x=='I') {
			x= 1;
		}
		else if(x=='V') {
			x= 5;
		}
		else if(x=='X') {
			x= 10;
		}
		else if(x=='L') {
			x= 50;
		}
		else if(x=='C') {
			x= 100;
		}
		else if(x=='D') {
			x= 500;
		}
		else if(x=='M') {
			x= 1000;
		}
			return x;
	}
	public static int romanToInt(String s) {
		char[] ch= s.toCharArray();
		int sum= 0;
		int temp= 0;
			for(int i=0; i<ch.length; i++) {
					sum += num(ch[i]);
					temp= num(ch[i]);
					if(i<ch.length-1) {
						if(num(ch[i])<num(ch[i+1])) {
						sum -= temp;
						sum += num(ch[i+1])-num(ch[i]); 
						i++;
						}
					}
				}
			return sum;
	}
}
