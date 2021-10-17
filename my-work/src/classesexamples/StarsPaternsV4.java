package classesexamples;
import javax.swing.JOptionPane;
public class StarsPaternsV4 {
	public static void main(String[] args) {
		String n1=JOptionPane.showInputDialog("ENTER A NUMBER : ");
		int n2=Integer.parseInt(n1);
		for(int x=1;x<=n2;x++) {
			for(int y=1;y<=x;y++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}
