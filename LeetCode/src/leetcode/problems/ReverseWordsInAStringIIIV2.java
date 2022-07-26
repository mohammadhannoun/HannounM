package leetcode.problems;

public class ReverseWordsInAStringIIIV2 {
	public String reverseWords(String s) {
		String[] splitted = s.split(" ");
		StringBuilder result = new StringBuilder();
			for(String word : splitted) {
				result.append(new StringBuilder(word).reverse().toString() + " ");
			}
			return result.toString();
	}
}
