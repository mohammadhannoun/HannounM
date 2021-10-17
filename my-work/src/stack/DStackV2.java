package stack;

import java.util.Arrays;

public class DStackV2 {
	static int cntr = 0;
	int[] array = new int[2];
	int top = 0; 
	public void push(int number) {
		if(top == array.length) {
			int[] arr = new int[top*2];
			for(int i = 0; i < array.length; i++) {
				arr[i] = array[i];
			}
			array = arr;
		}
		array[top] = number;
		top++;
		cntr++;
	}
	public int pop() {
		if(top == 0) {
			isEmpty();
			return 0;
		}
		int[] arr = new int[top-1];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = array[i];
		}
		int pop = array[top-1];
		array = arr;
		top--;
		cntr--;
		return pop;
	}
	public void isEmpty() {
		if(top == 0) {
			System.out.println("The stack is Empty!");
		}
		else {
			System.out.println("The Stack isn't Empty!");
		}
	}
	public int removeAt(int index) {
		if(top == 0) {
			isEmpty();
			return -1;
		}
		int removed = array[index];
		int[] arr = new int[array.length-1];
		int cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				if(i == index) {
					i++;
				}
				arr[cnt] = array[i];
				cnt++;
			}
			top--;
			cntr--;
			array = arr;
			return removed;
	}
	public void printStack() {
		for(int i = 0; i < cntr; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
