package leetcode.problems;

public class Convert1DArrayInto2DArrayV2 {
	public int[][] construct2DArray(int[] original, int m, int n) {
		if(original.length != m*n) return new int[][] {};
		int[][] array = new int[m][n];
			for(int i = 0; i < original.length; i++) {
				array[i / n][i % n] = original[i];
			}
			return array;
	}
}
