
package stackUsingArray;
//import java.util.Arrays;
public class Stack {
	private int maxSize;  
	private int top;      
	private int[] stackArray;

	public Stack(int size) {
		maxSize = size;
		stackArray = new int[maxSize];
		top = -1;
	}

	public void push(int value) {
		if (top < maxSize - 1) {
			stackArray[++top] = value;
			System.out.println("Pushed " + value + " to the stack");
		} else {
			System.out.println("Stack Overflow! " + value);
		}
	}

	public int pop() {
		if (top >= 0) {
			int poppedValue = stackArray[top--];
			System.out.println("Popped " + poppedValue);
			return poppedValue;
		} else {
			System.out.println("Stack Underflow!");
			return -1;
		}
	}

	public int peek() {
		if (top >= 0) {
			return stackArray[top];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public void display() {
		if (top >= 0) {
			System.out.print("Stack elements: ");
			for (int i = 0; i <= top; i++) {
				System.out.print(stackArray[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("Stack is empty");
		}
	}
}


