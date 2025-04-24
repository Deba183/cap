package Composition;

public class Phone {
	String phName;
	Battery b;
	public Phone(String phName, String batteryType) {
		this.phName = phName;
		this.b = new Battery(batteryType);
		
	}
	public void display() {
		System.out.println(phName+" "+b.batteryType);
	}
	

}
