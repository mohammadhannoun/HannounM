package external_exercises;
import javax.swing.JOptionPane;
public class ExSeven {
	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Enter the number : ");
		int n1=Integer.parseInt(num1);
			for(int i=1; i<=10; i++) {
				System.out.println(n1+" X "+i+" = "+(n1*i));
			}
	}
}
