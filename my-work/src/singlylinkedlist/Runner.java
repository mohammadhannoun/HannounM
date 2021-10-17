package singlylinkedlist;

public class Runner {
	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.removeAt(2);
		list.removeAtBeg();
		list.remove();
		list.print();
	}
}
