package revision;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] data = {1, 5, 9, 6, 3, 5, 2597, 2156, 588, 45, -57};
		System.out.println("Unsorted Data : "+Arrays.toString(data));
		data = bubbleSort(data);
		System.out.println("Sorted Data : "+Arrays.toString(data));
	}
	public static int[] bubbleSort(int[] data) {
		int len = data.length;
		int swp = 0;
		boolean noSwp = true;
			for(int i = len-1; i >= 1&&noSwp; i--) {
				noSwp = false;
				for(int j = 0; j < i; j++) {
					if(data[j] > data[j+1]) {
						swp = data[j];
						data[j] = data[j+1];
						data[j+1] = swp;
						noSwp = true;
					}
				}
			}
			return data;
	}
}
