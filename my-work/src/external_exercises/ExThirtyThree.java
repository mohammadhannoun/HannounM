package external_exercises;
import javax.swing.JOptionPane;
public class ExThirtyThree {
	public static void main(String[] args) {
		String num=JOptionPane.showInputDialog("Enter a number : ");
		int num1=Integer.parseInt(num);
		int digit=0;
		int sum=0;
		while(num1!=0) {
			digit=num1%10;
			num1=num1/10;
			sum +=digit;
		}
		System.out.print("The  sum of the digits = "+sum);
	}
}
