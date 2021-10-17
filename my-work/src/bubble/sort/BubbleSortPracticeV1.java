package bubble.sort;

public class BubbleSortPracticeV1 {
	public static int[] bubbleSort(int[] array) {
		int n= array.length;
		int tmp= 0;
		boolean s= true;
			for(int i=n-1; i>=1&&s; i--) {
				s= false;
				for(int j=0; j<i; j++) {
					if(array[j]>array[j+1]) {
						tmp= array[j];
						array[j]= array[j+1];
						array[j+1]= tmp;
						s= true;
					}
				}
			}
			return array;
	}
	public static void printArray(int[] array) {
		for(int i: array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] array= {5, 4, 3, 2, 1};
		System.out.println("Initial Array : ");
		printArray(array);
		array= bubbleSort(array);
		System.out.println("Sorted Array : ");
		printArray(array);
	}
}
