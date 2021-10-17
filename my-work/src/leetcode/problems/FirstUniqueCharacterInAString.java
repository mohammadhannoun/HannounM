package leetcode.problems;
import java.util.Scanner;
public class FirstUniqueCharacterInAString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = scan.nextLine();
		int result = firstUniqChar(s);
		System.out.println(result);
		scan.close();
	}
	public static int firstUniqChar(String s) {
	        int cntr = 0; 
	        int result = 0;
	        for(int i = 0; i < s.length(); i++){
	            cntr = 0;
	            for(int j = 0; j < s.length(); j++){
	                if(s.charAt(j) == s.charAt(i)){
	                    cntr++;
	                    if(cntr > 1) {
	                    	break;
	                    }
	                }
	            }
	            if(cntr == 1){
	                result = i; 
	                return result;
	            }
	            else{
	                result = -1;
	            }
	        }
	        return result;
	    }
}
