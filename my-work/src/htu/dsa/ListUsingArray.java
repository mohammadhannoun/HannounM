package htu.dsa;

public class ListUsingArray {
	private int maxSize;
	private int[] list;
	private int end;
		ListUsingArray(){
			maxSize = 2;
			list = new int[maxSize];
			end = -1;
		}
		private void dynamicArray() { //O(n)
			maxSize *= 2;
			int[] tmp = new int[maxSize];
			for(int i = 0; i < list.length; i++) tmp[i] = list[i];
			list = tmp;
		}
		public void insert(int data) { //O(n)
			if(end == list.length - 1) dynamicArray();
			end++;
			list[end] = data;
		} 
		public void insert(int p, int data) { //O(n)
			if(end == list.length - 1) dynamicArray();
			for(int i = end; i >= p; i--) list[i + 1] = list[i];
			list[p] = data;
			end++;
		}
		public int remove(int p) { //O(n)
			if(p < 0 || p > end) throw new IllegalAccessError();
			int removed = list[p];
			for(int i = p; i < end; i++) list[i] = list[i + 1];
			end--;
			return removed;
		} 
		public int count() { //O(1)
			if(end < 0) throw new IllegalAccessError();
			return end+1;
		}
		public int read(int p) { //O(1)
			if(p < 0 || p > end) throw new IllegalAccessError();
			return list[p];
		}
		public void modify(int p, int data) { //O(1)
			if(p < 0 || p > end) throw new IllegalAccessError();
			list[p] = data;
		}
		public void print() { //O(n)
			System.out.print("[");
			for(int i = 0; i <= end; i++) {
				if(i != end) System.out.print(list[i] + " , ");
				else System.out.print(list[i]);
			}
			System.out.println("]");
		}
}
