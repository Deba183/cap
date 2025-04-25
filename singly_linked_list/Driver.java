package singly_linked_list;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("enter 1 to insert data\nenter 2 display\nenter 3 to update any position"+"\nenter 4 to insert at position\nenter 5 to exit");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter the data");
				int data = scan.nextInt();
				list.insert(data);;
				break;


			}
			case 2:
				list.display();
				break;
			case 3:
				System.out.println("enter data to update");
				int data = scan.nextInt();
				System.out.println();
			default:
				System.out.println("invalid choice");
			}

		}
		
		}
	}


