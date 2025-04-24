package doublyLinkedL;

import singly_linked_list.Node;

public class DoublyLL {
	Node head;
	Node tail;
	
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head==null) {
			head = node;
			tail = node;
			count++;
			
		}
		else {
			tail.next = node;
			node.previous = tail;
			count++;
		}
	}
	
	public void displayForward() {
		Node current = head;
		while(current!=head) {
			System.out.println(current.data + " ");
			current = current.next;
			System.out.println();
		}
	}
	public void displayBackward() {
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		while(current.previous!= null) {
			System.out.println("in reverse order: ");
			System.out.println(current.data);
			current = current.previous;
		}
	}
	
	public void update(int pos, int data) {
		if(head == null) {
			System.out.println("no data for updation");
			return;
		}
		if(pos == 1) {
			head.data = data;
			return;
		}
		if(pos == count) {
			tail.data = data;
			return;
		}
		Node current = head;
		int i = 1;
		while(current!=null) {
			if(i == pos) {
				current.data = data;
				return;
			}
			i++;
			current = current.next;
		}
	}
	
	public void insertAt(int position, int data) {
		Node node = new Node(data);
		if(head == null) {
			
		}
	}

}
