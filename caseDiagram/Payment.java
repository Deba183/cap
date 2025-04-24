package caseDiagram;

abstract class Payment {
	
	private String transactionId;
	private double amount;
	
	public Payment(String transactionId, double amount) {
		this.transactionId = transactionId;
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public double calculateDiscount() {
		return (amount>500)?amount* 0.10 : 0;
	}
	public abstract void processPayment();

}
