package queueUsingArray;
import java.util.Scanner;
public class Driver {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Queue queue = new Queue();
	        int choice, element;

	        do {
	            
	            System.out.println("1. Enqueue");
	            System.out.println("2. Dequeue");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Queue Empty?");
	            System.out.println("6. Exit");
	            System.out.print("choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter element: ");
	                    element = scanner.nextInt();
	                    queue.enqueue(element);
	                    break;

	                case 2:
	                    queue.dequeue();
	                    break;

	                case 3:
	                    queue.peek();
	                    break;

	                case 4:
	                    queue.display();
	                    break;

	                case 5:
	                    if (queue.isEmpty()) {
	                        System.out.println("Queue is empty");
	                    } else {
	                        System.out.println("Queue is not empty");
	                    }
	                    break;

	                case 6:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        } while (choice != 6);

	        scanner.close();
	}

}
