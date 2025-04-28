package rideBookingSystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideBookingSystem {
	 List<Customer> customers = new ArrayList<>();
	 List<Driver> drivers = new ArrayList<>();
	 List<Ride> rides = new ArrayList<>();
	 
	 public void registerCustomer(Customer customer) {
		 customers.add(customer);
	 }
	 
	 public void registerDriver(Driver driver) {
		 drivers.add(driver);
	 }
	 
	 public Ride bookRide(Customer customer) {
		 Optional<Driver> driverOpt = drivers.stream().filter(Driver::isAvailable).findFirst();
		 if (driverOpt.isPresent()) {
			 Driver driver = driverOpt.get();
			 driver.setAvailable(false);
			 Ride ride = new Ride(customer, driver);
			 rides.add(ride);
			 System.out.println("ride booked successfully");
			 return ride;
		 }else {
			 throw new InvalidRideException("no drivers available");
		 }
	 }
	 
	 public void saveRides() {
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter("rides.txt"))){
			 for(Ride ride : rides) {
				 bw.write(ride.rideDetails());
				 bw.newLine();
			 }
		 }catch (IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void loadDriversFromFile() {
		 try(BufferedReader br = (new FileReader("drivers.txt"))){
			 String line;
			 while((line = br.readLine()) != null) {
				 String[] parts = line.split(".");
				 if(parts.length>=2) {
					 registerDriver(new Driver(parts[0], parts[1]));
				 }
			 }
		 }catch(IOException e) {
			 System.out.println("no drivers to load");
		 }
	 }
	 public void saveDriversToFile() {
		 try(BufferedWriter bw = new BufferedWriter(new FileWriter("drivers.txt"))){
			 for(Driver driver : drivers) {
				 bw.write(driver.id + "," + driver.name);
				 bw.newLine();
			 }
		 }catch (IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void showAllDrivers() {
		 drivers.forEach(Driver::showProfile);
	 }
	 
	 public List<Customer> getCustomers(){
		 return customers;
	 }
	 

}
