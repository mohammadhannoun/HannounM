package external_exercises;

import javax.swing.JOptionPane;

public class ExThirtySeven {
		public static void main(String[] args){
			String sentence=JOptionPane.showInputDialog("Write a sentence : ");
			char[] reverse=sentence.toCharArray();
			System.out.print("Reversed String : ");
			for(int i=(reverse.length-1); i>=0; i--) {
			System.out.print(reverse[i]);
			}
		}
}
