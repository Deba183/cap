package hierarchical;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	
	public static void displayDetails() {
		System.out.println("vehicle no "+ vehicleNumber);
		System.out.println("brand "+ brand);
		
	}
	public static void rentVehicle() {
		System.out.println();
		
	}

}
