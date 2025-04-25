package stackUsingArray;

public class Driver {
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);

		stack.display();

		stack.pop();
		stack.pop();

		stack.display();

		System.out.println("Top element is: " + stack.peek());

		stack.push(60);
		stack.push(70);

		stack.display();

		System.out.println("Is stack empty? " + stack.isEmpty());
		System.out.println("Is stack full? " + stack.isFull());
	}
}



