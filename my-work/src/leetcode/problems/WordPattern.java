package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class WordPattern {
	 public static void main(String[] args) {
		String s = "           Hello It's        me        ";
		wordPattern(s);
		
	}
	
	public static void wordPattern(String s) {
		int q = 0;
		while(s.charAt(q) == ' ') {
			s = s.substring(q+1);
			q++;
		}
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				String u = s.substring(0, i);
				s = s.substring(i + 1);
				list.add(u);
			}
		}
		for(String o : list) {
			System.out.println(o);
		}
		
		
	} 
}
