package leetcode.problems;

import javax.swing.JOptionPane;

public class LargestCommonPrefix {
	public static void main(String[] args) {
		String s= JOptionPane.showInputDialog("Enter the length of the array : ");
		int len= Integer.parseInt(s);
		String[] strs= new String[len];
			for(int i=0; i<strs.length; i++) {
				strs[i]= JOptionPane.showInputDialog("Enter the element number "+(i+1)+" : ");
			}
		//dddxx
	}
	
}