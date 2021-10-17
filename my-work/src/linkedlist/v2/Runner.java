package linkedlist.v2;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(0.00);
		list.insert(1.11);
		list.insert(2.22);
		list.insert(3.33);
		list.deleteAt(0);
		list.show();
	}
}
