package classesexamples;

import javax.swing.JOptionPane;

public class StarsPaternsV6 {
	public static void main(String[] args) {
		String number=JOptionPane.showInputDialog("Enter the number : ");
		int numberTwo=Integer.parseInt(number);
		int a=1;
		for(int x=1;x<=numberTwo;x++) {
			for(int y=1;y<=numberTwo;y++) {
				if(y!=a) {
				System.out.print(" *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			a++;
		}
	}
}
