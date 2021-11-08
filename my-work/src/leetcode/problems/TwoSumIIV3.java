package leetcode.problems;
import java.util.HashMap;
public class TwoSumIIV3 {
	public  int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
			for(int i = 0; i < numbers.length; i++) {
				if(map.containsKey(numbers[i])) continue;
				map.put(numbers[i], i + 1);
			}
		
			for(int j = 0; j < numbers.length; j++) {
				int temp = target - numbers[j];
					if(map.containsKey(temp) && (j + 1) != map.get(numbers[j])) {
						if((j + 1) > map.get(numbers[j])) {
							return new int[] {map.get(numbers[j]), j + 1};
						} else {
							return new int[] { j + 1, map.get(numbers[j])};
						}
					}
			}
			return new int[] {-1,-1};
	}
}
