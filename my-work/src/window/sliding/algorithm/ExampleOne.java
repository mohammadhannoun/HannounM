package window.sliding.algorithm;

public class ExampleOne {
	public static void main(String[] args) {
		 int arr[] = {1,12,-5,-6,50,3};
	        int k = 4;
	        System.out.println(windowSlidingAlgo(arr, k));
	}
	public static double windowSlidingAlgo(int[] data, int k) {
		int maxF = 0;
			for(int i = 0; i < k; i++) {
				maxF += data[i];
			}
		int maxS = maxF;
			for(int j = k; j < data.length; j++) {
				maxS += data[j] - data[j - k];
				maxF = Math.max(maxF, maxS);							
			}
			return (double)maxF / k;
	}
}
