package Aggregation;



public class Driver {
	public static void main(String[] args) {
		Sim sim = new Sim(1234567890);
		Phone phone = new Phone("Samsung", sim);
		
		phone = null;
		System.out.println(sim.phoneNo);
	}

}
