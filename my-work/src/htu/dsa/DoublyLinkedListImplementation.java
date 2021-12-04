package htu.dsa;

public class DoublyLinkedListImplementation {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.remove(2);
		list.remove(1);
		list.printRev();
	}
}
