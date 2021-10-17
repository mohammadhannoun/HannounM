package codeforces;

import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print(" ");
		int lines = scan.nextInt();
		String[] S = new String[lines+1];
		for(int i = 0 ; i < S.length ; i++) {
			System.out.print(" ");
			S[i] = scan.nextLine();
		}
		for(int j = 0; j < S.length; j++) {
			abrev(S[j]);
		}
		scan.close();
	}
	public static void abrev(String S) {
		String s = "";
		int cntr = 0; 
		if(S.length()<=10) {
			System.out.println(S);
		}
		else {
			s += S.charAt(0);
			for(int i= 1; i < S.length()-1; i++) {
				cntr++;
			}
			s += cntr; 
			s += S.charAt(S.length()-1);
			System.out.println(s);
		}
	}
}
