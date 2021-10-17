package external_exercises;

import javax.swing.JOptionPane;

public class ExSeventyTwo {
	public static void main(String[] args) {
		String str= JOptionPane.showInputDialog("Write something : ");
		String sub="";
		int lng= str.length();
			if(str.length()>=3) {
				sub= str.substring(0,3);
				System.out.print(sub);
			}
			else if(str.length()<3){
				sub= str.substring(0);
				if(lng==2) {
				System.out.println(sub+"#");
				}
				else if(lng==1) {
					System.out.println(sub+"#"+"#");
				}
				else if(lng==0) {
					System.out.println("#"+"#"+"#");
				}
			}	
			
	}
}
