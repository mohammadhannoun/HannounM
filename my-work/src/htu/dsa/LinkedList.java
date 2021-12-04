package htu.dsa;


public class LinkedList {
		private class Node {
			int data;
			Node next;
				public Node(int data) {
					this.data = data;
					next = null;
				}
		}
		private Node head;
		private int cntr = -1;
	public void insert(int data) { //O(n)
		Node newNode = new Node(data);
			if(head == null) head = newNode; //O(1)
			else {
				Node tmp = head;
				while(tmp.next != null) {
					tmp = tmp.next;
				}
				tmp.next = newNode;
			}
			cntr++;
	} // 1 2 3 4 insert (2, 99)
	public void insert(int p, int data) { //O(n)
		if(p == cntr + 1) {
			insert(data);
			return;
		}
		if(p < 0 || p > cntr + 1) throw new IllegalAccessError();
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			cntr++;
			return;
		}
			if(head == null) {
				head = newNode;
				cntr++;
				return;
			}
			if(p == 0) { //O(1)
				newNode.next = head;
				head = newNode;
				cntr++;
				return;
			}
				Node tmp = head;
				for(int i = 0; i < p - 1; i++) {
					tmp = tmp.next;
				}
				newNode.next = tmp.next;
				tmp.next = newNode;
			cntr++;
	}
	public int remove(int p) { //O(n)
		if(head == null || p < 0 || p > cntr) throw new IllegalAccessError();
		if(p == 0) { //O(1)
			Node oldNode = head;
			int removed = oldNode.data;
			head = head.next;
			oldNode.next = null;
			cntr--;
			return removed;
		}
		Node tmp = head;
		for(int i = 0; i < p - 1; i++) {
			tmp = tmp.next;
		}
		Node oldNode = tmp.next;
		int removed = oldNode.data;
		tmp.next = oldNode.next;
		oldNode.next = null;
		cntr--;
		return removed;
	}
	public int read(int p) { //O(n)
		if(head == null || p < 0 || p > cntr) throw new IllegalAccessError();
		if(p == 0) return head.data; //O(1)
		Node tmp = head;
			for(int i = 0; i < p; i++) {
				tmp = tmp.next;
			}
			return tmp.data;
	}
	public void modify(int p, int data) { //O(n)
		if(head == null || p < 0 || p > cntr) throw new IllegalAccessError();
		if(p == 0) head.data = data; //O(1)
		Node tmp = head;
			for(int i = 0; i < p; i++) {
				tmp = tmp.next;
			}
			tmp.data = data;
	}
	public int count() { //O(n)
		if(head == null) throw new IllegalAccessError();
		Node tmp = head;
		int cntr = 0;
			while(tmp != null) {
				cntr++;
				tmp = tmp.next;
			}
		return cntr;
	}
	
	public void print() { //O(n)
		if(head == null) {
			System.out.println("The List Is Empty !"); 
			return;
		}
		System.out.print("[");
		Node tmp = head;
			while(tmp != null) {
				if(tmp.next != null) System.out.print(tmp.data + " , ");
				else System.out.print(tmp.data);
				tmp = tmp.next;
			}
		System.out.println("]");
	}
}
