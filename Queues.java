package data_structures_and_algorithms;

import java.util.Queue;
import java.util.LinkedList;

public class Queues {
	static void run() {
		// Stack is FIFO - First-In First-Out (example: A line of people)
		
		/*
		 * What are the main uses of stacks?
		 * 1- keyboard buffer (letters should appear on the screen in the order they're pressed)
		 * 2- printer queue (print jobs should be completed in order)
		 * 3- used in linked lists, priority queues, breadth-first approach (since Queue is an interface)
		 */
		
		
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.isEmpty()); // check if queue is empty or not
		
		queue.offer("Karen"); // offer is the same as add / enqueue, add to the end of the queue
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
		
		System.out.println(queue.isEmpty());
		
		System.out.println(queue);
		
		System.out.println(queue.peek()); // peek is used to return who is in the first position of the line (queue) without removing
		System.out.println(queue);
		
		String removed = queue.poll(); // poll will return who is in the first position but will remove too
		// in the case of poll, it won't throw an error if queue is empty, poll is the same as dequeue or remove
		
		System.out.println(removed);
		System.out.println(queue);
		
		System.out.println(queue.size()); // i can check the size of my queue
		
		System.out.println(queue.contains("Steve")); // check if an element exists in the queue
		System.out.println(queue.contains("Karen")); 
	}
}
