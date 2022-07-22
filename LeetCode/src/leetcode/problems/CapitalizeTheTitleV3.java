package leetcode.problems;

public class CapitalizeTheTitleV3 {
	public String capitalizeTitle(String title) {
		title = title.toLowerCase();
		String[] arr = title.split(" ");
		title = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() < 3) {
				title += arr[i];
			} else {
				title += arr[i].substring(0, 1).toUpperCase();
				title += arr[i].substring(1);
			}
			title += " ";
		}
		return title;
	} 
}
