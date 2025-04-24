package caseDiagram;

public class CreditCard extends Payment{
	public CreditCard(String transactionId, double amount) {
		super(transactionId, amount);
	}
	@Override
	public void processPayment() {
		System.out.println("\n processing CreditCard payment");
		String transactionId = getTransactionId();
		double amount = getAmount();
		double discount = calculateDiscount();
		double transactionFee = (amount - discount) * 0.02;
		double finalAmount = (amount - discount) + transactionFee;
		System.out.println("transaction id: " + transactionId);
		System.out.printf("original amount: $%.2f%n", amount);
		System.out.printf("discount applied: $%.2f%n", discount);
		System.out.printf("transaction fee: $%.2f%n", transactionFee);
		System.out.printf("final payable amount: $%.2f%n", finalAmount);
		System.out.println("credit card payment successful");



		
		
	}
	

}
