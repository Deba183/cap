package stackUsingArray;

public class DriverLL {
	public static void main(String[] args) {
		StackLL stack = new StackLL();
		
		stack.push(10);
        stack.push(20);
        stack.push(30);

        
        stack.display();
        
        System.out.println("Top element: " + stack.peek());

       
        System.out.println("Popped element: " + stack.pop());

       
        stack.display();

        
        System.out.println("Is stack empty? " + stack.isEmpty());

       
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

       
        System.out.println("Is stack empty? " + stack.isEmpty());
	}

}
