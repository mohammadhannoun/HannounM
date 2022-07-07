package leetcode.problems;

public class ConcatenationOfArray {
	public int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*nums.length];
        int counter= 0;
            for(int i= 0; i<ans.length; i++){
                ans[i]= nums[counter];
                counter++;
                if(i==nums.length-1){
                    counter= 0;
                    }
        }
          return ans;
    }
}
