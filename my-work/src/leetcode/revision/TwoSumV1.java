package leetcode.revision;
import java.util.HashMap;
public class TwoSumV1 {
	public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && (nums[i] + nums[j] == target)){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0,0};
    }
}
