package htu.dsa;

public class SumOf2DArrayElements {
	public static void main(String[] args) {
		int[][] array = new int[2][2];
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < 2; j++) {
					array[i][j] = i*j + 5;
				}
			}
		System.out.println("Sum = " + getSum(array));
	}
	public static int getSum(int[][] array) {
		int sum = 0;
			for(int i = 0; i < array.length; i++) {
				for(int j = 0; j < array[i].length; j++) {
					sum += array[i][j];
				}
			}
			return sum;
	}
}
