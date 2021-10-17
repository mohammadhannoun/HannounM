package external_exercises;
import java.util.Scanner;
public class ExOneHundred {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the length of the arrays : ");
		int len= scan.nextInt();
		int[] arrOne= new int[len];
		int[] arrTwo= new int[len];
			for(int i=0; i<len; i++) {
				System.out.print("Enter the element number "+(i+1)+" of the first array : ");
				arrOne[i]= scan.nextInt();
				System.out.print("Enter the element number "+(i+1)+" of the second array : ");
				arrTwo[i]= scan.nextInt();
			}
		int count= count(arrOne, arrTwo);
			System.out.println("The number of elements = "+count);
			scan.close();
	}
	public static int count(int[] arrOne, int[] arrTwo) {
		int cntr= 0;
		for(int i=0; i<arrOne.length; i++) {
			int diff= Math.abs(arrOne[i]-arrTwo[i]);
			if(diff<=1&&(arrOne[i]!=arrTwo[i])) {
				cntr++;
			}
		}
			return cntr;
	}
}
