package das.assign;

public class Task4 {
	private class Node {

		Node next;
		String name;
		int age;

		private Node(String name, int age) {
			next = null;
			this.name = name;
			this.age = age;
		}
	}

	private int capacity = 10;
	private Node[] heads = new Node[capacity];
	private int elements = 0;

	public void insert(String name, int age) {
		// From line 23 to 25 can be used to rehash, as it implements the load factor
		/*
		 * if ((elements / heads.length) > (0.7)) { reHash(); }
		 */
		int index = hash(name);
		Node person = new Node(name, age);
		if (heads[index] == null) {
			heads[index] = person;
		} else if (heads[index] != null) {
			Node iter = heads[index];
			while (iter.next != null) {
				if (iter.name.equals(name)) {
					if (iter.age != age) {
						iter.age = age;
					}
					return;
				}
				iter = iter.next;
			}
			if (iter.name.equals(name)) {
				if (iter.age != age) {
					iter.age = age;
				}
				return;
			}
			iter.next = person;
		}
		elements++;
	}

	public void remove(String name) {

		int index = hash(name);
		if (heads[index] == null)
			return;
		Node iter = heads[index];
		if (heads[index].name.equals(name)) {
			Node old = heads[index];
			heads[index] = heads[index].next;
			old.next = null;
			if (heads[index] == null) {

			}
			elements--;
			return;
		}
		while (iter.next != null) {
			if (iter.next.name.equals(name)) {
				Node old = iter.next;
				iter.next = old.next;
				old.next = null;
				elements--;
				return;
			}
			iter = iter.next;
		}
		return;
	}

	public boolean search(String name) {

		int index = hash(name);
		if (heads[index] == null)
			return false;
		else {
			Node iter = heads[index];
			while (iter != null) {
				if (iter.name.equals(name))
					return true;
				iter = iter.next;
			}
			return false;
		}
	}

	public void print() {

		for (int i = 0; i < heads.length; i++) {
			if (heads[i] != null) {
				Node iter = heads[i];
				while (iter != null) {
					System.out.println("[Name : " + iter.name + ", Age : " + iter.age + "]");
					iter = iter.next;
				}
			}
		}
	}

	private int hash(String name) {

		int sum = 0;
		for (Character c : name.toCharArray()) {
			sum += c;
		}
		return (sum % capacity);
	}

	/*
	 * private void reHash() { // I added this method not knowing whether it is
	 * required or not (ReHashing) capacity *= 2; Node[] tmp = new Node[capacity];
	 * for (int j = 0; j < heads.length; j++) { Node iter = heads[j]; if (iter !=
	 * null) { while (iter != null) { Node person = new Node(iter.name, iter.age);
	 * int index = hash(iter.name); if (tmp[index] == null) { tmp[index] = person; }
	 * else if (tmp[index] != null) { Node itr = tmp[index]; while (itr.next !=
	 * null) { itr = itr.next; } itr.next = person; } iter = iter.next; } } } heads
	 * = tmp; }
	 */
}
