package external_exercises;
import java.util.Scanner;
public class ExOneHundredAndOne {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int len= scan.nextInt();
		int[] arr= new int[len];
			for(int i= 0; i<arr.length; i++) {
				System.out.println("Enter the element number "+(i+1)+" : ");
				arr[i]= scan.nextInt();
			}
		int tenCntr= 0;
		int twenCntr= 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]==10) {
					tenCntr++;
				}
				else if(arr[j]==20) {
					twenCntr++;
				}
			}
			System.out.println(String.valueOf(tenCntr>twenCntr));
		scan.close();
	}
}
