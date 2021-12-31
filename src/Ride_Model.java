import java.util.ArrayList;

public class Ride_Model {
	Ride_Entity rideE = new Ride_Entity();
	static ArrayList<Driver_Controller> drivers = new ArrayList<Driver_Controller>();
	
	public ArrayList<Driver_Controller> readDrivers() {
		return drivers;
	}
	public void updateDrivers(Driver_Controller d) {
		drivers.add(d);
	}
	public void deleteDrivers(Driver_Controller d) {
		drivers.remove(d);
	}
	
}
