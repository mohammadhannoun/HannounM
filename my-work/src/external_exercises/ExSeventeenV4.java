package external_exercises;

import javax.swing.JOptionPane;

public class ExSeventeenV4 {
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Enter the first binary number : ");
		char[] arr1=num1.toCharArray();
		String num2=JOptionPane.showInputDialog("Enter the second binary number : ");
		char[] arr2=num2.toCharArray();
		int size1=0;
		int size2=0;
		int test=0;
			for(int i=0; i<arr1.length; i++) {
				size1++;
				int x=arr1[i];
				System.out.print(x);
			}
			System.out.println(size1);
			for(int j=0; j<arr2.length; j++) {
				size2++;
			}
		String[] s1=new String[size1];
		String[] s2=new String[size2];
		
		
			
	}
}
