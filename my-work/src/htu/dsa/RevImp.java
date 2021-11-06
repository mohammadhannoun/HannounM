package htu.dsa;

public class RevImp {
	public static void main(String[] args) {
		ListRev list = new ListRev();
			
		list.insert(99);
		list.insert(5);
		list.insert(5);
		list.insert(2, 0);
		list.print();
		list.remove(0);
		list.read(1);
		list.modify(550, 2);
		list.print();	
	}
}
