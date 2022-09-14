package leetcode.problems;

public class RemoveAllAdjacentDuplicatesInStringV1 {
	 public String removeDuplicates(String s) {
	        if(s.length() == 1) return s;
	        //removing duplicates from the beginning of the string
	        //checking whether all characters are duplicates
	        while(s.length() > 2 && s.charAt(0) == s.charAt(1)) s = s.substring(2);
	        //returning result if s is empty
	        if(s.length() == 2 && s.charAt(0) == s.charAt(1)){
	            return "";  
	        }
	        int fast = 2;
	        int slow = 1;
	        while(s.length() > 1 && fast != s.length()){
	            if(s.charAt(slow) == s.charAt(fast)){
	                s = s.substring(0, slow) + s.substring(fast + 1);
	                if(slow != 0){
	                    slow--;
	                    fast--;
	                } 
	            } else {
	                slow++;
	                fast++;
	            }
	        }
	        return s;
	    }
}
