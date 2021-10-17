package linkedlist.revision;

public class LL {
	Node head;
		public void addAtBeg(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			node.next = head;
			head = node;
		}
		public void add(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			if(head == null) {
				head = node;
			}
			else {
				Node n = head;
				while(n.next != null) {
					n = n.next;
				}
				n.next = node;
			}
		}
		public void addAt(int index, int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
				if(index == 0) {
					addAtBeg(data);
					return;
				}
			Node n = head;
				for(int i = 0; i < index-1; i++) {
					n = n.next;
				}
			node.next = n.next;
			n.next = node;
		}
		public void removeAtBeg() {
			head = head.next;
		}
		public void remove() {
			if(head == null) {
				System.out.println("The list is Empty!");
				return;
			}
			Node n = head;
			int cntr = 0;
				while(n.next != null) {
					n = n.next;
					cntr++;
				}
			n = head;
				for(int i = 0; i < cntr - 1; i++) {
					n = n.next;
				}
				n.next = null;
		}
		public void removeAt(int index) {
			Node n = head;
			Node n1 = null; 
				for(int i = 0; i < index - 1; i++) {
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
		}
		public void printList() {
			Node n = head;
				while(n.next != null) {
					System.out.println(n.data);
					n = n.next;
				}
				System.out.println(n.data);
		}
}		
