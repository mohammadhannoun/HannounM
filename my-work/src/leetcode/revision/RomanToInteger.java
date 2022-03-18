package leetcode.revision;

public class RomanToInteger {
	public int romanToInt(String s) {
		int number = 0;
		for(int i = 0; i < s.length(); i++) {
			if((i != s.length() - 1) && getValue(s.charAt(i + 1)) > getValue(s.charAt(i))) {
					number += getValue(s.charAt(i + 1)) - getValue(s.charAt(i));
					i++;
					continue;
				} else {
					number += getValue(s.charAt(i));
				}
			}
		return number;
	} public int getValue(char roman) {
		switch(roman) {
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 50;
		case 'C' : return 100;
		case 'D' : return 500;
		case 'M' : return 1000;
		}
		return 0;
	}
}
