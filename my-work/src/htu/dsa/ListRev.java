package htu.dsa;

public class ListRev {
	int[] array;
	int end;
	int capacity;
	
	ListRev(){ 
		capacity = 2;
		array = new int[capacity];
		end = -1;
	}
	public void DArray() { //O(n)
		capacity *= 2;
		int[] temp = new int[capacity];
			for(int i = 0; i <= end; i++) {
				temp[i] = array[i];
			}
			array = temp;
	}
	public void insert(int data) { //O(n)
	   if(end == (capacity - 1)) {
			DArray();
		}
		end++;
		array[end] = data;
	}
	public void insert(int data, int p) { //O(n)
		if(end == (capacity - 1)) {
			DArray();
		}
		for(int i = end; i >= p; i--) {
			array[i + 1] = array[i];
		}
		array[p] = data;
		end++;
	}
	public void remove(int p) { //O(n)
		if(end < 0) {
			System.out.println("The List Is Empty ! ");
			return;
		}
			for(int i = p; i < end; i++) {
				array[i] = array[i + 1];
			}
		end--;	
	}
	public int read (int p) { //O(1)
		return array[p];
	}
	public void modify(int data, int p) { // //O(1)
		array[p] = data;
	}
	public void print() {  //O(n)
		System.out.print("[");
			for(int i = 0; i <= end; i++) {
				if(i != end) {
					System.out.print(array[i] + ", ");
				} else {
					System.out.print(array[i] + "]");
				}
			}
			System.out.println();
	}

}
