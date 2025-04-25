package stackUsingArray;
public class StackLL {
	
	private Node top;
	
	 private class Node {
	        int data;
	        Node next;
	        
	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }
	 
	 public StackLL() {
	        top = null;
	    }
	 
	 public void push(int data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	        System.out.println(data + " pushed to stack");
	    }
	 
	 public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1; 
	        }
	        int poppedData = top.data;
	        top = top.next;
	        return poppedData;
	    }
	 
	 public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return -1; 
	        }
	        return top.data;
	    }
	 
	 public boolean isEmpty() {
	        return top == null;
	    }

	 
	 public void display() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty");
	            return;
	        }
	        Node current = top;
	        System.out.print("Stack elements: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	 }

}
