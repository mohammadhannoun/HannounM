package classesexamples;

import javax.swing.JOptionPane;

public class Methods {
	public static void main(String[] args) {
		int n1=readNumber();
		int n2=readNumber();
		int n3=readNumber();
		System.out.println("sum = "+(n1+n2+n3));
	}
	public static int readNumber() {
		String number=JOptionPane.showInputDialog("Please Enter a number : ");
		int n=Integer.parseInt(number);
		return n;
	}
}
