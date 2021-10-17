package external_exercises;
import javax.swing.JOptionPane;
public class ExFive {
	public static void main(String[] args) {
		String u=JOptionPane.showInputDialog("Enter the first number : ");
		double n1=Double.parseDouble(u);
		String k=JOptionPane.showInputDialog("Enter the second number : ");
		double n2=Double.parseDouble(k);
		double product=n1*n2;
		System.out.print(n1+" X "+n2+" = ."+product);
	}
}
