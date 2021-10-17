package external_exercises;
import javax.swing.JOptionPane;
public class ExSix {
	public static void main(String[] args) {
		String x=JOptionPane.showInputDialog("Enter the first number : ");
		double n1=Double.parseDouble(x);
		String y=JOptionPane.showInputDialog("Enter the second number : ");
		double n2=Double.parseDouble(y);
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" X "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));
		System.out.println(n1+" mod "+n2+" = "+(n1%n2));
		
	}
}
