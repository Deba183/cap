package circularSinglyLinkedList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CircularLinkedList list = new CircularLinkedList();
		boolean flag = true;
		while(flag) {
			System.out.println("enter 1 to insert elements\nenter 2 to exit");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("enter the data");
				int data = scan.nextInt();
				list.insert(data);;
				break;


			}
			case 2:
				flag = false;
				break;
			default:
				System.out.println("invalid choice");
			}
		}

	}
}
