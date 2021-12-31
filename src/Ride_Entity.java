import java.util.ArrayList;

public class Ride_Entity {
	// Attributes:
	String source;
	String destination;
	Rider_Controller rider = new Rider_Controller();
	Driver_Controller driver = new Driver_Controller();
	Rate rate = new Rate();
	boolean status;
	protected boolean completed = false;
	double price;
	static int rideID = 1;
	int id;

	Ride_Entity() {

	}

	Ride_Entity(Rider_Controller r, String source, String destination) {
		this.rider = r;
		this.source = source;
		this.destination = destination;
		this.id = rideID++;
	}


	Ride_Entity(String source, String destination) {
		this.source = source;
		this.destination = destination;
		this.id = rideID++;
	}

	public void setRider(Rider_Controller r) {

		this.rider = r;
	}

	public Rider_Controller getRider() {
		return rider;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
		return source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public double getID() {
		return id;
	}

	public String toString() {
		return ("Ride source: " + this.getSource() + " | Ride destination: " + this.getDestination());

	}

	// to later add it to history
	public Ride_Entity(String source, String destination, Rider_Controller rider, Driver_Controller driver) {

	}
	public int getMyRate() {
		return this.rate.getRate();
	}
}
