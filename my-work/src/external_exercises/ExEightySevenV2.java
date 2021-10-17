package external_exercises;
import java.util.Scanner;
public class ExEightySevenV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num= scan.nextInt();
		int cntr= getCntr(num);
		int pow= (int) Math.pow(10, cntr-1);
		int[] arr= new int[cntr];
		int nu= num;
		for(int i=0; i<cntr; i++) {
			if(cntr==cntr-1) {
				arr[i]= nu%10;
			}
			else {
				num= nu;
			num= (int) num/pow;
			arr[i]= (int) (num%10);
			pow= pow/10;
			}
		}
		int sum= 0;
		for(int j : arr) {
			sum +=j;
		}
		System.out.println("The sum of the digits = "+sum);
		int su= getCntr(sum);
		int[] som= new int[su];
		int pows= (int)Math.pow(10, su-1);
		int s= sum;
		for(int j=0; j<su; j++) {
			sum= s;
			sum= (int) sum/pows;
			som[j]= (int) (sum%10);
			pows= pows/10;
		}
		for(int k : som) {
			if(k==0) {
				System.out.print(" Zero ");
			}
			else if(k==1) {
				System.out.print(" One ");
			}
			else if(k==2) {
				System.out.print(" Two ");
			}
			else if(k==3) {
				System.out.print(" Three ");
			}
			else if(k==4) {
				System.out.print(" Four ");
			}
			else if(k==5) {
				System.out.print(" Five ");
			}
			else if(k==6) {
				System.out.print(" Six ");
			}
			else if(k==7) {
				System.out.print(" Seven ");
			}
			else if(k==8) {
				System.out.print(" Eight ");
			}
			else if(k==9) {
				System.out.print(" Nine ");
			}
			scan.close();
		}
	}
	public static int getCntr(int x) {
		int cntr= 0;
		while(x!=0) {
			x= x/10;
			cntr++;
		}
		return cntr;
	}
}
