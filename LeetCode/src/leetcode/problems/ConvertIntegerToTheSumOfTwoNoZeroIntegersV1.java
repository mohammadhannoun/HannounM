package leetcode.problems;

import java.util.HashMap;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersV1 {
	// Time --> O(NlogN)
	// Space --> O(N)
	public int[] getNoZeroIntegers(int n) {
		int first, second;
		if(n % 2 == 0) {
			first = n / 2;
			second = n / 2;
		} else {
			first = (n / 2) + 1;
			second = n / 2;
		}
		while(getNumberOfZeros(first) != 0 || getNumberOfZeros(second) != 0) {
			first++;
			second--;
		}
		return new int[] {first, second};
    } public int getNumberOfZeros(int n) {
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	while(n != 0) {
			if(map.containsKey(n % 10)) {
				map.put(n % 10, map.get(n % 10) + 1);
			} else {
				map.put(n % 10, 1);
			}
			n = n / 10;
		}
    	if(map.containsKey(0)) {
    	return map.get(0);
    	} else {
    		return 0;
    	}
    }
}
