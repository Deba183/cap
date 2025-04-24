package abstraction;

public class Car extends Vehicle{
	
	@override
	public void start() {
		System.out.println("Electric engine start");
		
	}
	@override
	public abstract void message() {
		System.out.println("Have a safe ride");
	}

}
