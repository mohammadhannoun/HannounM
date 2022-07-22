package leetcode.problems;

public class CapitalizeTheTitleV2 {
	public static void main(String[] args) {
		System.out.println(capitalizeTitle("capiTalIze tHe titLe"));
	}
	public static String capitalizeTitle(String title) {
		if(title.length() < 3) return title.toLowerCase();
		int left = title.indexOf(' '), right = title.lastIndexOf(' '), length = 0;
		boolean onePiece = true;
		title = title.toLowerCase();
		char[] arr = title.toCharArray();
		if(left >= 3 || ((title.length() - 1) - right) >= 3) {
			if(left >= 3) arr[0] = (char)(arr[0] - 32);
			if((title.length() - 1) - right >= 3) arr[right + 1] = (char)(arr[right + 1] - 32);
		}
		for(int i = left + 1; i <= right; i++) {
			if(arr[i] == ' ') {
				length = (i - 1) - left;
					if(length >= 3) {
						arr[left + 1] = (char)(arr[left + 1] - 32);
					}
				left = i;
				onePiece = true;
			}
		}
		if(!onePiece) {
			arr[0] = (char)(arr[0] - 32);
		}
		title = "";
		for(char c : arr) {
			title += c;
		}
		return title;
	}
}
