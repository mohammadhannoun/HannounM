package classesexamples;

import javax.swing.JOptionPane;

public class ExSix {
	public static void main(String[] args) {
		String firstName =JOptionPane.showInputDialog("First name : ");
		String lastName =JOptionPane.showInputDialog("Last name : ");
		System.out.println("Your full name : "+(firstName+lastName));
	}
}
