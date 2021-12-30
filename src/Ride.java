import java.util.ArrayList;

public class Ride {
	// Attributes:
	String source;
	String destination;
	Rider rider=new Rider();
	Driver driver;
	boolean status;
	double price;
	static ArrayList<Driver> drivers = new ArrayList<Driver>();
	static ArrayList<Ride> Requests = new ArrayList<Ride>();
	Rider_Entity rider_entity;
	static int rideID = 1;
	int id;

	Ride() {

	}

	Ride(Rider_Entity rider_entity, String source, String destination) {
		this.rider_entity = rider_entity;
		this.source = source;
		this.destination = destination;
		Requests.add(this);
		this.id = rideID++;
	}
	/*Ride(String source, String destination) {
		this.source = source;
		this.destination = destination;
		Requests.add(this);
		this.id = rideID++;}
	*/
	public static void addDriver(Driver d) {
		drivers.add(d);
	}

	public static void removeDriver(Driver d) {
		drivers.remove(d);
	}

	public void setRider(Rider_Entity rider_entity) {

		this.rider_entity = rider_entity;
	}
	/*public Rider getRider(Rider r) {

		return r;
	}*/
	public Rider_Entity getRider() {
		return rider_entity;
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
		return ("Ride source: " + this.getSource() + " | Ride destination: " + this.getDestination() );//+ " | Rider name: "+ this.rider_entity.Username );

	}

	// to later add it to history
	public Ride(String source, String destination, Rider rider, Driver driver) {

	}

	public void end() {

	}
}
