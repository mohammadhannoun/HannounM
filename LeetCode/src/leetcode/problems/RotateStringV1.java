package leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class RotateStringV1 {
	public boolean rotateString(String s, String goal) {
        if(s.length() == 1 && goal.length() == 1) {
        	if(s.charAt(0) == goal.charAt(0)) {
        		return true;
        	} else {
        		return false;
        	}
        }
        if(s.equals(goal)) return true;
        char[] temp = s.toCharArray();
        char c = temp[temp.length - 1];
        temp[temp.length - 1] = temp[0];
        temp[0] = c;
        s = "";
        for(char tmp : temp){
        	s += tmp;
        }
        if(s.equals(goal)) return true;
        return false;
     }
}
