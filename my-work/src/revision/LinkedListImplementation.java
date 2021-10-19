package revision;

public class LinkedListImplementation {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.removeAt(1);
		list.removeAt(1);
		list.removeAt(1);
		list.removeAt(1);
		list.removeAt(1);
		list.showList();
	}
}
