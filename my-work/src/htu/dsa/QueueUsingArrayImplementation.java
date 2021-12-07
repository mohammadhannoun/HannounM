package htu.dsa;

public class QueueUsingArrayImplementation {
	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		System.out.println(queue.front());
		
		
		queue.print();
	}
}
