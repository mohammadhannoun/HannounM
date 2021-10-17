package revision;

public class Stack {
	int capacity = 2;
	int[] array = new int[capacity];
	int top = 0;
	int cntr = 0;
		public void dynamicArray() {
			int[] newArray = new int[capacity * 2];
				for(int i = 0; i < array.length; i++) {
					newArray[i] = array[i];
				}
				capacity *= 2;
				array = newArray;
		}
		public void push(int data) {
			if(top == capacity) {
				dynamicArray();
			}
			array[top] = data;
			top++;
			cntr++;
		}
		public boolean isEmpty() {
			if(top == 0) {
				return true;
			}
			return false;
		}
		public void pop() {
			if(isEmpty()) {
				System.out.println("The Stack Is Empty ! ");
				return;
			}
				int[] newArray = new int[top - 1];
				for(int i = 0; i < newArray.length; i++) {
					newArray[i] = array[i];
				}
				array = newArray;
				top--;
				cntr--;
		}
		public void removeAt(int index) {
			if(isEmpty()) {
				System.out.println("The Stack Is Empty ! ");
				return;
			}
			int[] newArray = new int[array.length - 1];
			int aC = 0;	
				for(int i = 0; i < newArray.length; i++) {
					if(i == index) {
						aC++;
					}
					newArray[i] = array[aC];
					aC++;
				}
				top--;
				cntr--;
				array = newArray;
		}
		public void showStack() {
			for(int i = 0; i < cntr; i++) {
				System.out.print(array[i]+" ");
			}
		}
}
