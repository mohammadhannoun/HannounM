package classesexamples;

import javax.swing.JOptionPane;

public class ExSeven {
	public static void main(String[] args) {
		String n1 =JOptionPane.showInputDialog("Enter the first number : ");
		String n2 =JOptionPane.showInputDialog("Enter the second number : ");
		String n3 =JOptionPane.showInputDialog("Enter the third number : ");
		
		int num1 =Integer.parseInt(n1);
		int num2 =Integer.parseInt(n2);
		int num3 =Integer.parseInt(n3);
		
		System.out.println("The sum of the three numbers is = "+(num1+num2+num3));
	}
}
