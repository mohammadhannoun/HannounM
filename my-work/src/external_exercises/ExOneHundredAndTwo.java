package external_exercises;
import java.util.Scanner;
public class ExOneHundredAndTwo {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int leng= scan.nextInt();
		int[] arr= new int[leng];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
		}
		getArray(arr);
		scan.close();
	}
	public static void getArray(int[] arr) {
		int cntr= 0;
		for(int k= 0; k<arr.length; k++) {
			if(arr[k]==10||arr[k]==30) {
				cntr++;
			}
		}
		System.out.println(String.valueOf(cntr>0));
	}
}
