package doubly.linked.list;

public class Node {
    Node prev;
	int data;
	Node next;
		Node(int data){
			prev = null;
			this.data = data;
			next = null;
		}
}
