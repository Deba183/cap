package rideBookingSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		RideBookingSystem system = new RideBookingSystem();
		system.loadDriversFromFile();
		
		while(true) {
			System.out.println("\nMenu:");
			System.out.println("\n1.register a customer:");
			System.out.println("\n2.register a driver:");
			System.out.println("\n3.book a ride:");
			System.out.println("\n4.show all drivers:");
			System.out.println("\n5.save data and exit");
			System.out.println("enter your choice");
			
			int choice = Integer.parseInt(scanner.nextLine().trim());
			switch(choice) {
			case 1:
				
				
			}
		}
	}

}
