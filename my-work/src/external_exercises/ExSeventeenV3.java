package external_exercises;

import javax.swing.JOptionPane;

public class ExSeventeenV3 {
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Enter the first binary number : ");
		char[] arr1=num1.toCharArray();
		String num2=JOptionPane.showInputDialog("Enter the second binary number : ");
		char[] arr2=num2.toCharArray();
		int size1=0;
		int size2=0;
			for(int i=0; i<arr1.length; i++) {
				size1++;
			}
			for(int j=0; j<arr2.length; j++) {
				size2++;
			}
			int[] arr3=new int[size1];
			int[] arr4=new int[size2];
			for(int x=0; x<size1; x++) {
				arr3[x]=arr1[x];
			}
			for(int y=0; y<size2; y++) {
				arr4[y]=arr2[y];
			}
			for(int h=0; h<size1; h++) {
				System.out.println(arr4[h]);
			}
			int[] sum=new int[size1];
			for(int k=size1-1; k>=0; k--) {
				if((arr3[k]+arr4[k])==0) 
				{
					sum[k]=0;
							}
				else if((arr3[k]+arr4[k])==1) 
				{
					sum[k]=1;
						}
				else if((arr3[k]+arr4[k])==2)
				{
					sum[k]=10;
					}
			}
			System.out.println("Sum of the two binary numbers = ");
			for(int x1=0; x1<size1; x1++) 
			{
				System.out.print(sum[x1]);
			}
			
		
		
	}
}
