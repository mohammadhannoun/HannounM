package leetcode.problems;

import java.util.Stack;

public class CapitalizeTheTitleV1 {
	public static void main(String[] args) {
		System.out.println(capitalizeTitle("Iuz g om"));
	}
	public static String capitalizeTitle(String title) {
		if(title.length() <= 2) {
			return title.toLowerCase();
		}
		title = title.toLowerCase();
		char[] arr = title.toCharArray();
		arr[0] = (char)(arr[0] - 32);
		boolean exist = false;
		for(int i = 1; i < arr.length - 1; i++) {
			if(arr[i] == ' ') {
				arr[i + 1] = (char)(arr[i + 1] - 32);
				exist = true;
			}
		}
		if(exist == false && title.length() < 3) {
			return title.toLowerCase();
		}
		int cntr = 0;
		while(cntr < arr.length && arr[cntr] != ' ') {
			cntr++;
		}
		if(exist == false) {
			title = "";
			for(char c : arr) {
				title += c;
			}
			return title;
		}
		if(cntr < 3) {
			arr[0] = (char)(arr[0] + 32);
		}
		
		cntr = title.lastIndexOf(' ');
		if((arr.length - 1) - cntr < 3) {
			arr[cntr + 1] = (char)(arr[cntr + 1] + 32);
		}
		
		cntr = title.indexOf(' ');
		int length = 0;
		for(int i = cntr + 1; i <= title.lastIndexOf(' '); i++) {
			if(arr[i] == ' ') {
				length = (i - 1) - cntr;
				if(length < 3) {
					arr[cntr + 1] = (char)(arr[cntr + 1] + 32);
				}
				cntr = i;
			}
		}
			
		title = "";
		for(char c : arr) {
			title += c;
		}
		return title;
	}
}
