package external_exercises;
import java.util.Scanner;
public class ExSeventeenV2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr1=new int[2];
		int[] arr2=new int[2];
		System.out.print("Enter the first binary number : ");
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.print("Enter the second binary number : ");
		for(int j=0; j<arr2.length; j++) {
			arr1[j]=scan.nextInt();
		}
		int[] arr3=new int[arr2.length];
		for(int k=arr2.length-1; k>=0; k--) {
			if((arr1[k]+arr2[k])==0) 
			{
				arr3[k]=0;
						}
			else if((arr1[k]+arr2[k])==1) 
			{
				arr3[k]=1;
					}
			else if((arr1[k]+arr2[k])==2)
			{
				arr3[k]=10;
				}
			}
			System.out.println("Sum ");
			for(int x=0; x<arr2.length; x++) 
			{
				System.out.print(arr3[x]);
			}
	}
}
