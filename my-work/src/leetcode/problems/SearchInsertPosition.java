package leetcode.problems;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int ans = searchInsert(nums, 7);
			System.out.println(ans);
	}
	  public static int searchInsert(int[] nums, int target) {
	        int len = nums.length;
	        int midPoint = len / 2;
	        int ans = -1;
	        int k = 0;
	        	if(nums[midPoint] == target) {
	        		ans = len / 2;
	        		return ans;
	        	}
	        	else if(nums[midPoint] > target) {
	        		for(int i = 0; i < midPoint; i++) {
	        			if(nums[i] == target) {
	        				ans = i;
	        				break;
	        			}
	        		}
	        		if(ans == -1) {
	        			while(nums[k] < target) {
	        				k++;
	        			}
	        			return k;
	        		}
	        		return ans;
	        	}
	        	else {
	        		for(int j = midPoint + 1; j < len; j++) {
	        			if(nums[j] == target) {
	        				ans = j;
	        				break;
	        			}
	        		}
	        		if(ans == -1) {
	        			k = midPoint;
	        			while(k < len && nums[k] < target) {
	        				k++;
	        			}
	        			return k;
	        		}
        			return ans;
	        	}
	    }
}
