package leetcode.problems;

public class SortAnArray {
	 public int[] sortArray(int[] nums) {
	        if(nums.length <= 1){
	            return nums;
	        }
	        int[] left = new int[nums.length/2];
	        int[] right = new int[nums.length - left.length];
	            for(int i = 0; i < left.length; i++){
	                left[i] = nums[i];
	            }
	            for(int j = 0; j < right.length; j++){
	                right[j] = nums[left.length+j];
	            }
	        int[] result = new int[nums.length];
	        left = sortArray(left);
	        right = sortArray(right);
	            result = merge(left, right);
	                return result;
	    }
	    public int[] merge(int[] left, int[] right){
	        int[] result = new int[left.length+right.length];
	        int leftPointer, rightPointer, resultPointer;
	        leftPointer = rightPointer = resultPointer = 0;
	            while(leftPointer < left.length || rightPointer < right.length){
	                if(leftPointer < left.length && rightPointer < right.length){
	                    if(left[leftPointer] < right[rightPointer]){
	                        result[resultPointer++] = left[leftPointer++];
	                    }
	                    else{
	                        result[resultPointer++] = right[rightPointer++];
	                    }
	                }
	                else if(leftPointer < left.length){
	                    result[resultPointer++] = left[leftPointer++];
	                }
	                else{
	                    result[resultPointer++] = right[rightPointer++];
	                }
	            }
	        return result;
	    }
}
