package external_exercises;
import javax.swing.JOptionPane;
public class ExSeventeen {
	public static void main(String[] args) {
		/*
		 * Therefore in binary:
		 *	0 + 0 = 0
		 *	0 + 1 = 1
		 *	1 + 0 = 1
		 *  1 + 1 = 10 (which is 0 carry 1)
		 */
		String binary=JOptionPane.showInputDialog("Enter the first bunary number : ");
		char[] binary2=binary.toCharArray();
		String binary3=JOptionPane.showInputDialog("Enter the second bunary number : ");
		char[] binary4=binary3.toCharArray();
		int[] arr1=new int[binary2.length];
		int[] arr2=new int[binary4.length];
		for(int i=0; i<binary2.length; i++) 
		{
			arr1[i]=binary2[i];
			arr2[i]=binary4[i];
							}
		int[] arr3=new int[binary2.length];

		for(int k=((binary2.length)-1); k>=0; k--)
		{
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
		System.out.println("Sum of the two binary numbers = ");
			for(int x=0; x<binary2.length; x++) 
			{
				System.out.print(arr3[x]);
			}
	}
}

