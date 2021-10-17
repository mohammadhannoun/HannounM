package external_exercises;
import java.io.File;
import javax.swing.JOptionPane;
public class ExFourtyFiveV2 {
	public static void main(String[] args) {
		String input= JOptionPane.showInputDialog("Enter the source of the file: ");
		String fileName= input;
		File testTwo= new File(fileName);
		long fileSize= testTwo.length();
		System.out.println("The size of the file in Bytes = "+fileSize);
	}
}
