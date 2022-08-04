package codeforces.problems;

import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		String[] arr = new String[x+1];
		for(int i = 0; i < x+1; i++) {
			String word = scan.nextLine();
			arr[i] = word;
		}
		for(int i = 0; i < x+1; i++) {
			if(arr[i].length() > 10) {
				char temp = arr[i].charAt(arr[i].length()-1);
				int len = arr[i].length() - 2;
				arr[i] = arr[i].substring(0,1);
				arr[i] = arr[i].concat(String.valueOf(len));
				arr[i] += temp;
			}
		}
		System.out.println();
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
