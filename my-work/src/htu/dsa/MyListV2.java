package htu.dsa;

import java.util.Arrays;

public class MyListV2 {
	private int[] A;
	private int end;
	private int maxSize;
		MyListV2(){ //Constructor
			maxSize = 4;
			A = new int[maxSize];
			end = -1;
		}
		public void DArray(){ // O(n)
			maxSize *= 2;
			int[] tmp = new int[maxSize];
			for(int i = 0; i <= end; i++) {
				tmp[i] = A[i];
			}
			A = tmp;
		}
		public void insert(int data) { // O(n)
			if(end == (maxSize - 1)) {
				DArray();
			}
			end++;
			A[end] = data;
		} 
		public void insert(int data, int p) { //O(n)
			if(p > end || p < 0) {
				throw new IllegalAccessError();
			}
			if(end == (maxSize - 1)) {
				DArray();
			}
			for(int i = end; i >= p; i--) {
				A[i + 1] = A[i];
			}
			A[p] = data;
			end++;
		}
		public void remove(int p) {	// O(n)
			if(p > end || p < 0) {
				throw new IllegalAccessError();
			}
			for(int i = p; i < end; i++) {
				A[i] = A[i+1];
			}
			end--;
		}
		public void modify(int p, int data) { // O(1)
			if(p > end || p < 0) {
				throw new IllegalAccessError();
			}
			A[p] = data;
		}
		public int read(int p) { // O(1)
			/* We can use this method but the user has to have a console in order to have this message
			 * System.out.println("Invalid index");
			 * return -1;
			 */
			// This method is more general
			if(p > end || p < 0) {
				throw new IllegalAccessError();
			}
			
			return A[p];
			
		}
		public int count() { // O(1)
			if(end < 0) {
				System.out.println("The List Is Empty ! ");
			}
			return end+1;
		}
		private void print() { // O(n)   --> It should be private so the user has no access for printing all the data at once as it's not of the requirements
			System.out.print("[");
			for(int i = 0; i <= end; i++) {
				if(i == end) {
					System.out.print(A[i]+"]");
				}else {
					System.out.print(A[i] + " , ");	
				}
			}
			System.out.println();
		}
}
