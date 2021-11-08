package doubly.linked.list;

public class DoublyLinkedList {
	private Node head;
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node tmp = head;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
			node.prev = tmp;
	}
	public void insert(int data, int p) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		if(p == 0) {
			head.prev = node;
			node.next = head;
			node.prev = null;
			return;
		}
		Node tmp = head;
		int cntr = 0;
			while(cntr < (p - 1)) {
				tmp = tmp.next;
				cntr++;
			}
			node.next = tmp.next;
			tmp.next = node;
			node.prev = tmp;
	}
	public void insertAtBeg(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		node.next = head;
		node.prev = null;
		head.prev = node;
		head = node;
	}
	public int remove() {
		Node tmp = head;
		int rem;
			while(tmp.next != null) {
				tmp = tmp.next;
			}
			rem = tmp.data;
			tmp.prev.next = null;
			return rem;
	}
	public int remove(int p) {
		if(p == 0) {
			head = head.next;
			head.prev = null;
		}
		Node tmp = head;
		int cntr = 0;	
		int rem;
			while(cntr < (p - 1)) {
				tmp = tmp.next;
				cntr++;
			}
			rem = tmp.next.next.data;
			tmp.next = tmp.next.next;
			tmp.next.prev = tmp;
			return rem;
	}
	public void removeAtBeg() {
		head = head.next;
		head.prev = null;
	}
	public void print() {
		Node node = head;
			while(node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
	}
}
