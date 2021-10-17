package leetcode.problems;

public class ReverseOnlyLettersV3 {
	public static String reverseOnlyLetters(String s) {
		char[] arr = s.toCharArray();
		int left, right;
		left = 0; 
		right = s.length()-1;
			while(left < right) {
				if(!Character.isLetter(arr[left])) {
					left++;
					continue;
				}
				if(!Character.isLetter(arr[right])) {
					right--;
					continue;
				}
				char temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				
				left++;
				right--;
			}
			return new String(arr);
	}	
	 public static void main(String[] args) {
		  String s = "Test1ng-Leet=-code-Q!";
		  s = reverseOnlyLetters(s);
		  System.out.println(s);
		  
	  }
}
