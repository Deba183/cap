package Aggregation;

public class Bank {
	String bankName;
	Customer customer;
	public (String bankName, Customer customer){
		this.bankName = bankName;
		this.customer = customer;
	}
	public void display() {
		System.out.println(this.bankName+" "+this.customer.customername);
	}

}
