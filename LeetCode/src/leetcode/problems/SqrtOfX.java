package leetcode.problems;

public class SqrtOfX {
	 public int mySqrt(int x) {
		    int sub = 1;
		    int cntr = 0;
		        while(x > 0 ){
		            x = x - sub;
		            sub += 2;
		            cntr++;
		        }
		        if(x < 0){
		         cntr--;
		            }
		        return cntr;
		    }
}
