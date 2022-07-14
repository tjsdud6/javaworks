package collection.queue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		//큐는 FIFO(First In First Out)
		MyQueue queue = new MyQueue();
		
		//자료 넣기 (A - B - C)
		queue.enQueue("A"); //0
		queue.enQueue("B"); //1
		queue.enQueue("C"); //2
		
		//자료 꺼내기(삭제 A - B- C)
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}

}
