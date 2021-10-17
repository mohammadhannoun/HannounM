package external_exercises;

import javax.swing.JOptionPane;

public class ExThirtyEight {
	public static void main(String[] args) {
		String sentence=JOptionPane.showInputDialog("Write a sentence : ");
		sentence=sentence.toLowerCase();
		char[] count=sentence.toCharArray();
		int spaces=0;
		int words=1;
		int letters=0;
		int numbers=0;
		int other=0;
			for(int i=0; i<count.length; i++) {
				if(count[i]==' ') {
					spaces++;
					words++;
				}
				else if(count[i]>='a'&&count[i]<='z') {
					letters++;
				}
				else if(count[i]>='0'&&count[i]<='9') {
					numbers++;
				}
				else {
					other++;
				}
				
			}
			System.out.print("The String is : "+sentence+"\n"+"letters : "+letters+"\n"+"spaces : "+spaces+"\n"+"words : "+words+"\n"+"numbers : "+numbers+"\n"+"other : "+other);
	}
}
