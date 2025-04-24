package Aggregation;

public class DriverB {
	public static void main(String[] args) {
		Customer customer = new Customer("Debanjana");
		Bank bank = new Bank("IB", customer);
		
		customer = null;
		System.out.println(customer.customername);
	}

}
