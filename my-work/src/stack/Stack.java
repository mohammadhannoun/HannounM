package stack;

public class Stack {
	int[] arr= new int[4];
	int top= 0;
		public void push(int data) {
			if(top<4) {
			arr[top]= data;
			top++;
			}
			else {
				System.out.println("The stack is full !");
			}
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("The stack is empty !");
				return 0;
			}
			else {
			int data;
			top--;
			data= arr[top];
			arr[top]= 0;
			return data;
			}
		}
		
		public void show() {
			for(int i : arr) {
				System.out.print(i+" ");
			}
		}
		
		public int peek() {
			top--;
			return arr[top];
		}
		
		public int size() {
			return top;
		}
		
		public boolean isEmpty() {
			return top<=0;
		}
}
