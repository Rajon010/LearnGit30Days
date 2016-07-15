public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(0);
		queue.dequeue();
		queue.enqueue(1);
		queue.dequeue();
		queue.enqueue(2);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
	}
}
