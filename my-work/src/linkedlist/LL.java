package linkedlist;

public class LL {
	Node head;
		public void insert(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;
				if(head == null) {
					head = node;
				}else {
					Node n = head;
					while(n.next != null) {
						n = n.next;
					}
					n.next = node;
				}
		}
		public void showList() {
			Node n = head;
			while(n.next != null) {
				System.out.println(n.data);
				n = n.next;
			}
			System.out.println(n.data);
		}
}
