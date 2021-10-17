package external_exercises;
import java.util.Scanner;
public class ExNinetySeven {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int len= scan.nextInt();
		System.out.println("Enter the specified number : ");
		int specified= scan.nextInt();
		int[] arr= new int[len];
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the element number "+(i+1)+" : ");
			arr[i]= scan.nextInt();
		}
		boolean x= cond(specified, arr, 1);
		boolean y= condV(specified, arr, 2);
		System.out.println(String.valueOf(x||y));
	}
	public static boolean cond(int y, int[] x, int num) {
		boolean sp= false;
		for(int j=0; j<x.length-num; j++) {
			if((x[j]+x[j+1]==2*y)) {
				sp= true;
			}
		}
		return sp;
	}
	public static boolean condV(int y, int[] x, int num) {
		boolean sp= false;
		for(int j=0; j<x.length-num; j++) {
			if(x[j]+x[j+2]==2*y) {
				sp= true;
			}
		}
		return sp;
	}
	
}
