package external_exercises;

import java.util.Scanner;

public class ExFiftyEight {
	public static void main(String[] args) {
		String sentence= sentnc();
		char[] letrs= sentence.toCharArray();
		for (int i=0; i<letrs.length; i++) {
		if(i!=0) {
			if(letrs[i-1]==' ') {
				letrs[i]= Character.toUpperCase(letrs[i]);
				}
			}
		else if(letrs[i]==letrs[0]) {
			letrs[i]= Character.toUpperCase(letrs[i]);
		}
	}
		for(int j=0; j<letrs.length; j++) {
			System.out.print(letrs[j]);
		}
		
}
	public static String sentnc() {
		System.out.print("Write your sentence : ");
		Scanner scan= new Scanner(System.in);
		String sentence= scan.nextLine();
		return sentence;
	}
}
