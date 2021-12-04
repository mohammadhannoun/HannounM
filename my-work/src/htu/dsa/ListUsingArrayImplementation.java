package htu.dsa;

public class ListUsingArrayImplementation {
	public static void main(String[] args) {
		ListUsingArray list = new ListUsingArray();
		list.insert(1);
		list.insert(2);
		list.insert(5);
		System.out.println(list.count());
		list.print();
	}
}
