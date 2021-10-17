package classesexamples;

import javax.swing.JOptionPane;

public class MethodsV3 {
	public static void main(String[] args) {
	int n1=readNumber("Enter number 1 : ");
	int n2=readNumber("Enter number 2 : ");
	int n3=readNumber();
	System.out.print("Sum = "+(n1+n2+n3));
	}
	public static int readNumber(String msg) {
		String num=JOptionPane.showInputDialog(msg);
		int n=Integer.parseInt(num);
		return n;
	}
	public static int readNumber() {
		return readNumber("Enter the number : ");
	}
}
