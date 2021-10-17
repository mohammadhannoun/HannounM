package classesexamples;
import java.util.Scanner;
public class ForLoopUser {
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);	
		int	sum=0;
		int array[]=new int[5];
		for(int i=0; i<array.length; i++) {
			System.out.print("Please Enter the "+i+" number : ");
			array[i]=scan1.nextInt();
			sum +=array[i];
				}
		System.out.print("The enterd values are : ");
		for(int j=0; j<array.length; j++) {
			System.out.print(array[j]);
			if(j!=array.length-1) {
			System.out.print(",");
			}
		}
		System.out.println(" ");
		System.out.print("Sum ="+sum);
		scan1.close();
	}
}
