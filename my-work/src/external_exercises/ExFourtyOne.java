package external_exercises;
import javax.swing.JOptionPane;
public class ExFourtyOne {
	public static void main(String[] args) {
		String char1=JOptionPane.showInputDialog("Write a character : ");
		char[] char2=char1.toCharArray();
		int x=0;
		for(int i=0; i<1; i++) {
			x=char2[i];
		}
		System.out.print("character "+char2[0]+" is equal to "+x+" in ascii");
	}
}
