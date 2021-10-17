package external_exercises;
import javax.swing.JOptionPane;
public class ExSixtyEightV2 {
	public static void main(String[] args) {
		String sen= JOptionPane.showInputDialog("Write your sentece : ");
		
		String lastThree= sen.substring(sen.length()-3);
		
		for(int i=0; i<4; i++) {
			System.out.print(lastThree);
		}
	}
}
