package external_exercises;

import java.util.Scanner;

public class ExEightyFive {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Write the sentence : ");
		String sen= scan.nextLine();
		char[] ch= sen.toCharArray();
			int x= 0;
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==' ') {
				x= i;
				i=(ch.length+1);
				}
			}
		String wrd= sen.substring(0,x);
		wrd = wrd.toLowerCase();
		ch= wrd.toCharArray();
		if(ch[0]=='h'&&ch[1]=='e'&&ch[2]=='l'&&ch[3]=='l'&&ch[4]=='o') {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		scan.close();	
	}
}
