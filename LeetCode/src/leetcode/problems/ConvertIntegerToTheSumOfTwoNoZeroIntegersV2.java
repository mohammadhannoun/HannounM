package leetcode.problems;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersV2 {
	// Time --> O(NlogN)
	// Space --> O(1)
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
    	int numberOfZeros = 0;
    	while(n != 0) {
			numberOfZeros += (n % 10 == 0) ? 1 : 0;
			n = n / 10;
		}
    	return numberOfZeros > 0 ? numberOfZeros : 0;
    }
}
