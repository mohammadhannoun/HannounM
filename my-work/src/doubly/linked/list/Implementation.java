package doubly.linked.list;

public class Implementation {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(9);
		list.insert(5);
		list.insert(4);
		list.insert(8);
		list.insert(25, 2);
		list.insertAtBeg(1);
	}
}
