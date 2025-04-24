package encapsulation;

public class NetBankDriver {
	public static void main(String[] args) {
		NetBank b = new NetBank();
		b.getBalance(1234);
		b.getBalance(5000,1234);
		b.getBalance(1234);
		b.getBalance(10000,1234);
		b.getBalance(1234);
	}

}
