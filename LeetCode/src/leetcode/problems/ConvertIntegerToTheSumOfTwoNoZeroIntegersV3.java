package leetcode.problems;

import java.util.Scanner;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegersV3 {
	// Time --> O(NlogN)
	// Space --> O(1)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int[] arr = getNoZeroIntegers(x);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
	}
	
	 public static int[] getNoZeroIntegers(int n) {
	        int[] result = new int[2];
	        for (int i = 1; i <= n/2; i++) {
	            if (!hasZeroes(i) && !hasZeroes(n-i)) {
	                result[0] = i;
	                result[1] = n-i;
	                break;
	            }
	        }
	        return result;
	    }
	    
	   public static boolean hasZeroes(int num) {
	        //  This tells that there are no zeros
		   	if (num == 0) {
	            return false;
	        }
	        // This shows if there are any zeros
	        if (num % 10 == 0) {
	            return true;
	        }
	        num = num/10;
	        return hasZeroes(num);
	    }

}
