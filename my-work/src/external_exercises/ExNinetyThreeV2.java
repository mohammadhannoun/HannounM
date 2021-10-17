package external_exercises;
import java.util.Scanner;
public class ExNinetyThreeV2 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int len= scan.nextInt();
		int[] arr= new int[len];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element number "+(i+1)+": ");
			arr[i]= scan.nextInt();
		}
		boolean n10= false;
		boolean n20= false;
		for(int j=0; j<arr.length-1; j++) {
			if(arr[j]==10&&arr[j+1]==10) {
				n10= true;
			}
			else if(arr[j]==20&&arr[j+1]==20) {
				n20= true;
			}
		}
		System.out.println(String.valueOf(n10 != n20));
	}
}
