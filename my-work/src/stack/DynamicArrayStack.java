package stack;

import java.util.Arrays;

public class DynamicArrayStack {
	int capacity = 2;
	int[] array = new int[capacity];
	int top = 0;
	int cntr = 0;
		public void dynamicArray() {
			int[] newArray= new int[capacity*2];
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			capacity *= 2;
			array = newArray;
		}
		
		public void push(int number) {
			if(top==capacity) {
				dynamicArray();
			}
			array[top] = number;
			top++;
			cntr++;
		}
		
		public int pop() {
			if(top>0) {
				int p = array[top-1];
				int[] newArray = new int[top-1];
				for(int i = 0; i < newArray.length; i++) {
					newArray[i] = array[i];
				}
				top = top-1;
				array = newArray;
				cntr--;
				return p;
			}
			else {
				isEmpty();
				return 1;
			}
		}
		
		public void showArray() {
			for(int i= 0; i<cntr; i++) {
				System.out.print(array[i]+" ");
			}
		}
		
		public void isEmpty() {
			if(top<=0) {
				System.out.println("The stack is empty !");
			}
		}
		
		public int removeAt(int index) {
			if(top<=0) {
				isEmpty();
				return 1;
			}
			else {
			int[] newArray = new int[top-1];
			int p = array[index];
			int cntro = 0;
			for(int i = 0; i < top; i++) {
				if(i != index) {
					newArray[cntro] = array[i];
					cntro++;
				}
			}
			cntr--;
			top -= 1;
			array = newArray;
			return p;
			}
		}		
}