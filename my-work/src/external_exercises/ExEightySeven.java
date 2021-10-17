package external_exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ExEightySeven {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num= scan.nextInt();
		ArrayList<Integer> digit= new ArrayList<Integer>();
		digit.add(num%10);
			while(num!=0) {
				num= num/10;
				digit.add(num%10);
			}
		ArrayList<Integer> sum= new ArrayList<Integer>();
		int sumV2= 0;
		for(int i=0; i<digit.size(); i++) {
			sumV2 += digit.get(i);
		}
		System.out.println(sumV2);
		int x=0; 
		while (sumV2!=0) {
			if(x==0) {
				sum.add(sumV2%10);
			}
			sumV2= sumV2/10;
			sum.add(sumV2%10);
		}
		for(int j= sum.size(); j>=0; j--) {
			if(j==1) {
				System.out.print(" One ");
			}
			else if(j==2) {
				System.out.print(" Two ");
			}
			else if(j==3) {
				System.out.print(" Three ");
			}
			else if(j==4) {
				System.out.print(" Four ");
			}
			else if(j==5) {
				System.out.print(" Five ");
			}
			else if(j==6) {
				System.out.print(" Six ");
			}
			else if(j==7) {
				System.out.print(" Seven ");
			}
			else if(j==8) {
				System.out.print(" Eight ");
			}
			else if(j==9) {
				System.out.print(" Nine ");
			}
		}
	}
}
