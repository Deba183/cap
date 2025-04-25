package singly_linked_list;

public class SinglyLinkedList {
	Node head;
	Node tail;
	Node node;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		
		if(head == null) {
		head = node;
		tail = node;
		count++;
		}
		else {
			tail.next = node;
			tail = node;
			count++;
		}
		
	}
	public void display() {
		if(head == null) {
			System.out.println("no data to display");
			return;
		}
		else {
			Node current = head;
			while(current!=null) {
				System.out.println(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
			
		}
	public void update(int data, int position) {
		if(position == 1) {
			head.data = data;
			return;
		}
		if(position==count){
			tail.data = data;
			return;
			
		}
		if(head==null) {
			System.out.println("no data to update");
			return;
			
		
			}
		if(position<1 || position>count) {
			System.out.println("position out of bounds");
			return;
		}
		Node current = head;
		for(int i=1;i<=count;i++) {
			if(i==position) {
				current.data=data;
				return;
			}
			current = current.next;
		}
			
		}
	public void insertAt(int data, int position) {
		if(head == null) {
			Node node = new Node(data);
			head = node;
			tail = node;
			count++;
			return;
		}
		if(position == 1) {
			Node node = new Node(data);
			node.next = head;
			head = node;
			count++;
			return;
		}
		
		
		Node current = head;
		for(int i=1;i<=count;i++) {
			if(i==position -1) {
				node.next = current.next;
				current.next = node;
				count++;
				return;
			}
			current = current.next;
		}
	}
	public void deleteAt(int position) {
		if(head == null) {
			System.out.println("no element to delete");
			return;
		}
		if(position == 1) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			count--;
			return;
		}
	}
		
		
	

}
