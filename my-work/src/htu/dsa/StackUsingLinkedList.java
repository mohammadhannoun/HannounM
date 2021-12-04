package htu.dsa;

public class StackUsingLinkedList {
	private class Node{ //Check screenshots from 1 to 4 to see Dr.Malik implementation
		int data;
		Node next;
			private Node(int data){
				this.data = data;
				next = null;
			}
	}
	Node top;
		public void push(int data) {
			Node newNode = new Node(data);
			newNode.next = top;
			top = newNode;
		}
		public void pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty ! ");
			return;
		}
			top = top.next;
		}
		public boolean isEmpty() {
			return top == null;
		}
		public int top() {
			return top.data;
		}
}
