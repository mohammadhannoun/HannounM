package classesexamples;
import javax.swing.JOptionPane;
public class MethodsV2 {
	public static void main(String[] args) {
		int n1=readNumber("Enter number 1 : ");
		int n2=readNumber("Enter number 2 : ");
		int n3=readNumber("Enter number 3 : ");
		System.out.print("Sum = "+(n1+n2+n3));
	}
	public static int readNumber(String msg) {
		String number=JOptionPane.showInputDialog(msg);
		int n=Integer.parseInt(number);
		return n;
	}
}
