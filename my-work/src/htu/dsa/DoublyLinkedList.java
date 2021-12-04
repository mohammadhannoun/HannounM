package htu.dsa;

public class DoublyLinkedList {
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
	private Node head;
	private Node last;
	private int cntr = -1;
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			last = head;
		}
		else {
			Node tmp = head;
				while(tmp.next != null) {
					tmp = tmp.next;
				}
				tmp.next = newNode;
				newNode.prev = tmp;
				last = newNode;
		}
		cntr++;
	}
	public void insert(int p, int data) {
		if(p < 0 || p > cntr + 1) throw new IllegalAccessError();
		if(p == cntr + 1 || head == null) {
			insert(data);
			return;
		}
		Node newNode = new Node(data);
		if(p == 0) {
			head.prev = newNode;
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
			tmp.next.prev = newNode;
			tmp.next = newNode;
			newNode.prev = tmp;
			cntr++;
	}
	public void remove(int p) { // 1 2 3 4 
		if(head == null || p > cntr || p < 0) throw new IllegalAccessError();
		if(p == 0) {
			Node oldNode = head;
			head = head.next;
			head.prev = null;
			oldNode.next = null;
			oldNode.prev = null;
			cntr--;
			return;
		}
		if(p == cntr) {
			Node tmp = head;
			for(int i = 0; i < p - 1; i++) {
				tmp = tmp.next;
			}
			tmp.next = null;
			last = tmp;
			cntr--;
			return;
		}
		Node tmp = head;
			for(int i = 0; i < p - 1; i++) {
				tmp = tmp.next;
			}
			Node oldNode = tmp.next;
			tmp.next = oldNode.next;
			tmp.next.prev = tmp;
			oldNode.next = null;
			oldNode.prev = null;
			cntr--;
	}
	public int read(int p) { // 1 2 3 4
		if(head == null || p > cntr || p < 0) throw new IllegalAccessError();
		if(p == 0) return head.data;
		Node tmp = head;
			for(int i = 0; i < p; i++) {
				tmp = tmp.next;
			}
			return tmp.data;
	}
	public void modify(int p, int data) {
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
		Node tmp = last;
		int cntr = 0;
			while(tmp != null) {
				cntr++;
				tmp = tmp.prev;
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
	public void printRev() {
		if(head == null) {
			System.out.println("The List Is Empty !"); 
			return;
		}
		System.out.print("[");
		Node tmp = last;
			while(tmp != null) {
				if(tmp.prev != null) System.out.print(tmp.data + " , ");
				else System.out.print(tmp.data);
				tmp = tmp.prev;
			}
		System.out.println("]");
	}
}
