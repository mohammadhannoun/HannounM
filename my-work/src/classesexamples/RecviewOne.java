package classesexamples;

import javax.swing.JOptionPane;

public class RecviewOne {
	public static void main(String[] args) {
	String num1=JOptionPane.showInputDialog("Enter a number : ");
	String num2=JOptionPane.showInputDialog("Your second number : ");
	
	int n1=Integer.parseInt(num1);
	int n2=Integer.parseInt(num2);
	
	System.out.println("The number you enterd is : "+(n1+n2));
	}

}
