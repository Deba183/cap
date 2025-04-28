package rideBookingSystem;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role = "Admin")
public class Admin extends User{
	
	public Admin(String id, String name) {
		super(id, name);
	}
		@Override
		public void showProfile() {
			Class<SecurityCheck> c = SecurityCheck.class;
			SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);
			System.out.println(this.name+" "+"Role: "+s.role());
		}
		
		public void removeDriver(List<Driver> drivers, String driverId) {
			try {
				Class<?> clazz = this.getClass();
				if(clazz.isAnnotationPresent(SecurityCheck.class)) {
					SecurityCheck s = clazz.getAnnotation(SecurityCheck.class);
					if("Admin".equals(s.role())) {
						Iterator<Driver> iterator = drivers.iterator();
						while(iterator.hasNext()) {
							Driver driver = iterator.next();
							if(driver.id.equals(driverId)) {
								iterator.remove();
								System.out.println(driverId+" removed");
								return;
							}
						}
						System.out.println("driver not found");
						
					}else {
						System.out.println("unauthorized role");
					}
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	


