package classesexamples;

import javax.swing.JOptionPane;

public class StarsPaternsV3 {
	public static void main(String[] args) {
		String n1=JOptionPane.showInputDialog("Enter the number : ");
		int n2=Integer.parseInt(n1);
		
		for(int x=1;x<=n2;x++) {
			for(int y=1;y<=n2;y++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}
