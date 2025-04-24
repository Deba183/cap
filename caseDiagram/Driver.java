package caseDiagram;

public class Driver {
	public static void main(String[] args) {
		Payment payment1 = new CreditCard("TXN12345", 600);
		payment1.processPayment();
		Payment payment2 = new CreditCard("TXN7890", 300);
		payment2.processPayment();
		
	}

}
