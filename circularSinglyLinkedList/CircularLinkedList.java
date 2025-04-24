package circularSinglyLinkedList;



public class CircularLinkedList {
	Node head;
	Node temp;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		
		
		if(head == null) {
		head = node;
		temp = node;
		node.next = head;
		count++;
		}
		else {
			temp.next = node;
			temp = node;
			temp.next = head;
			count++;
		}
		
	}
	public void display() {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			Node current = head;
			do {
				System.out.println(current.data+" ");
				current = current.next;
			}while(current != head);
			
		}
	}
	public void insertAt(int data, int position) {
		if(position<1) {
			System.out.println("Invalid position");
			return;
		}
		if(position>count) {
			System.out.println("position out of bounds");
			return;
			
		}
		if(position == 1) {
			Node node = new Node(data);
			if(head == null) {
				head = node;
				temp = node;
				temp.next = head;
				count++;
			}
			return;
		}
		if(position == count) {
			Node node = new Node(data);
			Node current = head;
			int i = 1;
			while(i<count-1) {
				current = current.next;
				i++;
			}
			current.next = node;
			node.next = temp;
			count++;
			return;
			
		}
		Node current = head;
		int index = 1;
		while(current.next != head) {
			if(index == position - 1) {
				
			}
		}
	}
}
