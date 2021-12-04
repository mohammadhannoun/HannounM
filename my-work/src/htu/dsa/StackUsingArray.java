package htu.dsa;

public class StackUsingArray {
	int top;
	int maxSize;
	int[] array;
		protected StackUsingArray(){
			top = -1;
			maxSize = 2;
			array = new int[maxSize]; 
		}
		private void dynamicArray() {
			maxSize *= 2;
			int[] tmp = new int[maxSize];
				for(int i = 0; i < array.length; i++) {
					tmp[i] = array[i];
				}
				array = tmp;
		}
		public void push(int data) {
			if(top == array.length - 1) dynamicArray();
			top++;
			array[top] = data;
		}
		public void pop() {
			if(isEmpty()) {
				System.out.println("The Stack Is Empty ! "); 
				return;
			}
			top--;
		}
		public boolean isEmpty() {
			if(top < 0) return true;
			return false;
		}
		public int top() {
			if(top < 0) throw new IllegalAccessError();
			return array[top];
		}
		public void print() {
			int cntr = top;
			System.out.print("[");
			for(int i = cntr; i >= 0; i--) {
				if(i != 0)System.out.print(array[i] + " , ");
				else System.out.print(array[i]);
			}
			System.out.println("]");
		}
}
