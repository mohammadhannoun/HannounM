package revision;

public class LinkedList {
	Node head;
		public void addAtBeg(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
				if(head == null) {
					head = node;
					return;
				}
			node.next = head;
			head = node;
		}
		public void add(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node tmp = head;
				if(head == null) {
					head = node;
					return;
				}
				while(tmp.next != null) {
					tmp = tmp.next;
				}
				tmp.next = node;
		}
		public void addAt(int index, int data) {
			if(index == 0) {
				addAtBeg(data);
				return;
			}
			Node node = new Node();
			node.data = data;
			node.next = null;
			Node tmp = head;
				for(int i = 0; i < index - 1; i++) {
					tmp = tmp.next;
				}
			node.next = tmp.next;
			tmp.next = node;
		}
		public boolean isEmpty() {
			if(head == null) {
				return true;
			}
			return false;
		}
		public void removeAtBeg() {
			if(isEmpty()) {
				System.out.println("The List Is Empty !");
				return;
			}
			head = head.next;
		}
		public void remove() {
			if(isEmpty()) {
				System.out.println("The List Is Empty !");
				return;
			}
			Node tmp = head;
			int cntr = 0;
				while(tmp.next != null) {
					tmp = tmp.next;
					cntr++;
				}
				tmp = head;
				for(int i = 0; i < cntr - 1; i++) {
					tmp = tmp.next;
				}
				tmp.next = null;
		}
		public void removeAt(int index) {
			if(isEmpty()) {
				System.out.println("The List Is Empty !");
				return;
			}
			if(index == 0 || head.next == null) {
				removeAtBeg();
				return;
			}
			Node tmp = head;
			Node temp = null;
				for(int i = 0; i < index - 1; i++) {
					tmp = tmp.next;
				}
				temp = tmp.next;
				tmp.next = temp.next;
		}
		public void showList() {
			if(isEmpty()) {
				System.out.println("The List Is Empty !");
				return;
			}
			Node tmp = head;
				while(tmp.next != null) {
					System.out.print(tmp.data+" ");
					tmp = tmp.next;
				}
					System.out.print(tmp.data);
		}
}
