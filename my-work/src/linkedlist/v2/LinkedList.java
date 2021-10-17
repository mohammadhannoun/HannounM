package linkedlist.v2;

public class LinkedList {
	Node head;
		public void insert(double data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
				if(head == null) {
					head = node;
				} else {
					Node n = head;
					while(n.next != null) {
						n = n.next;
					}
					n.next = node;
				}
		}
		public void insertAtBeg(double data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			node.next = head;
			head = node;
		}
		public void insertAt(int index, double data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node n = head;
			if(index == 0) {
				insertAtBeg(data);
				return;
			}
			for(int i = 0; i < index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
		public void deleteAt(int index) {
			if(index == 0) {
				head = head.next;
			}
			else {
				Node n = head;
				Node n1 = null;
				for(int i = 0; i < index-1; i++) {
					n = n.next;
				}
				n1 = n.next;
				n.next = n1.next;
					System.out.println("The Deleted Value = "+ n1.data);
			}
		}
		public void show() {
			Node temp = head;
				while(temp.next != null) {
					System.out.println(temp.data);
					temp = temp.next;
				}
				System.out.println(temp.data);
		}
}
