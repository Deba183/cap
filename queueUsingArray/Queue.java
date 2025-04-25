package queueUsingArray;

public class Queue {
	 private int[] queue;
	    private int front, rear, size;
	    private static final int MAX_SIZE = 5;

	    public Queue() {
	        queue = new int[MAX_SIZE];
	        front = -1;
	        rear = -1;
	        size = 0;
	    }

	    
	    public void enqueue(int element) {
	        if (size == MAX_SIZE) {
	            System.out.println("Queue is full!");
	        } else {
	            if (front == -1) {
	                front = 0; 
	            }
	            rear = (rear + 1) % MAX_SIZE;
	            queue[rear] = element;
	            size++;
	            System.out.println(element + " enqueued to queue.");
	        }
	    }

	   
	    public void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty!");
	        } else {
	            System.out.println(queue[front] + " dequeued from queue.");
	            front = (front + 1) % MAX_SIZE;
	            size--;
	        }
	    }

	    
	    public void peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty!");
	        } else {
	            System.out.println("Front element is: " + queue[front]);
	        }
	    }

	    
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty!");
	        } else {
	            System.out.print("Queue elements: ");
	            for (int i = 0; i < size; i++) {
	                System.out.print(queue[(front + i) % MAX_SIZE] + " ");
	            }
	            System.out.println();
	        }
	    }

	    
	    public boolean isEmpty() {
	        return size == 0;
	    }

}
