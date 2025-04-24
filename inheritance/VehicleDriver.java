package inheritance;

public class VehicleDriver {
	public static void main(String[] args) {
		Bike bike = new Bike("Honda", "Inline 4");
		Car c = new Car("Nissan", 69000, "V6");
		
		bike.display();
		c.display();
	}

}
