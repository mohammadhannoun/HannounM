package htu.dsa;

public class QueueUsingLinkedListImplementation {
	public static void main(String[] args) {
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		
		System.out.println(queue.front());
		System.out.println(queue.rear());
		
		queue.print();
		
		queue.deQueue();
		
		queue.print();
		
		System.out.println(queue.front());
		
		queue.enQueue(1);
		
		queue.print();
		
		System.out.println(queue.front());
		
	}
}
