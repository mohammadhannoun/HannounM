package external_exercises;
import java.util.Arrays;
import java.util.Scanner;
public class ExEightyThree {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the arrays : ");
			int lenF= scan.nextInt();
			int[] arrF= new int[lenF];
			int[] arrS= new int[lenF];
			int[] arrM= new int[lenF];
		for(int i= 0; i<lenF; i++) {
			System.out.println("Enter the element number "+(i+1)+" of the first array : ");
			arrF[i]= scan.nextInt();
			System.out.println("Enter the element number "+(i+1)+" of the second array : ");
			arrS[i]= scan.nextInt();
			arrM[i]= arrF[i]*arrS[i];
		}
			System.out.println("First array : "+Arrays.toString(arrF));
			System.out.println("Second array : "+Arrays.toString(arrS));
			System.out.println("The multiplication of the corresponding elements = "+Arrays.toString(arrM));
				scan.close();
	}
}
