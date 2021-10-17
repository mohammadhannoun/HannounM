package external_exercises;
import java.util.Scanner;
public class ExSeventeenV7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter teh first binary number : ");
		int num1 =scan.nextInt();
		System.out.print("Enter the second binary number : ");
		int num2=scan.nextInt();
		int i=0;
		int digitn1=0;
		int digitn2=0;
		int[] arr;
		int[] arr2;
		int[] arr3;
		int[] arr4;
		int[] sum=new int[20];
		int x=2;
		while(num1!=0||num2!=0) {
			digitn1=num1%10;
			arr=new int[i+1];
			arr[i]=digitn1;
			num1=num1/10;
			arr3=new int[i+1];
			arr3[i]=arr[i];
			digitn2=num2%10;
			arr2=new int[i+1];
			arr2[i]=digitn2;
			num2=num2/10;
			arr4=new int[i+1];
			arr4[i]=arr2[i];
			i++;
			if(num1==0&&num2==0) {
				i=i-1;
				for(int j=i; j>=0; j--) {
					sum[x]=(arr3[j]+arr4[j]);
					if(sum[x]==0) {
						sum[x]=0;
					}
					else if(sum[x]==1) {
						sum[x]=1;
					}
					else if(sum[x]==2) {
						sum[x]=10;
					}
					x--;
				}
				System.out.print("The sum of the two binary numbers : ");
				for(int k=0; k<20; k++) {
					System.out.print(sum[k]);	
				}
			}
		}
			
		scan.close();
	}
}
