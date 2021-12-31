
public class Ride_Controller {

	public Ride_Controller() {

	}

	public Ride_Controller(Rider_Controller r, String src, String dst) {
		this.rideM.rideE.setRider(r);
		this.rideM.rideE.setSource(src);
		this.rideM.rideE.setDestination(dst);
	}

	Ride_Model rideM = new Ride_Model();

	public void addDriver(Driver_Controller d) {
		rideM.updateDrivers(d);
	}

	public void removeDriver(Driver_Controller d) {
		rideM.deleteDrivers(d);
	}

	public void addTobalance(Driver_Controller driver, double price) {
		driver.driverM.driverE.setDriverBalance(price);
	}

	public String toString() {
		return ("" + this.rideM.rideE);
	}
}
