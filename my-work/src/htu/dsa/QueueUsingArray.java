package htu.dsa;

public class QueueUsingArray {
	int front;
	int rear;
	int[] array;
		QueueUsingArray(){
			front = -1;
			rear = -1;
			array = new int[10];
		}
		public void enQueue(int data) {
			if((rear+1) % (array.length) == front) {
				System.out.println("The Queue Is Full !");
				return;
			}
			else if(isEmpty()) {
				front = rear = 0;
			} else {
				rear = ((rear+1) % (array.length));
			}
			array[rear] = data;	
		}
		public void deQueue() {
			if(isEmpty()) throw new IllegalAccessError();
			else if(front == rear) {
				front = rear = -1;
				return;
			}else {
				front = ((front+1) % (array.length));
			}
		}
		public boolean isEmpty() {
			if ((rear == -1 && front == -1)) return true;
			return false;
		}
		public int front() {
			return array[front];
		}
		public void print() {
			System.out.print("[");
			if(front != -1 && rear != -1) {
				for(int i = front; i <= rear; i++) {
					if(i != rear)System.out.print(array[i] + " , ");
					else System.out.print(array[i]);
				}	
			}
			System.out.println("]");
		}
}
