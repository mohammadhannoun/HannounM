package htu.dsa;

public class QueueUsingLinkedList {
	private class Node{
		int data;
		Node next;
		Node prev;
			Node(int data){
				this.data = data;
				next = null;
				prev = null;
			}
	}
	
	Node front;
	Node rear;
	
	public void enQueue(int data) {
		Node node = new Node(data);
		if(rear == null && front == null) {
			rear = front = node;
			return;
		}
		rear.prev = node;
		node.next = rear;
		rear = node;
	}
	
	public void deQueue() {
		Node old = front;
		front = front.prev;
		front.next = null;
		old.prev = null;
	}
	
	public int front() {
		return front.data;
	}
	
	public int rear() {
		return rear.data;
	}
	
	public void print() {
		Node node = rear;
			while(node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
			System.out.println();
			System.out.println();
	}
}
