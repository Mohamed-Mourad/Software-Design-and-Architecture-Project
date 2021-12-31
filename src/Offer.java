public class Offer {
	
	boolean Accepted;
	private Driver_Controller driver;
	private Ride ride;
	private double Price;
	private Notifications noty = new Notifications();

	Offer(){}
	Offer(Driver_Controller driver, Ride ride, double Price) {
		this.driver = driver;
		this.ride = ride;
		this.Price = Price;
		noty.addOffer(this);
	}

	public Driver_Controller getDriver() {
		return driver;
	}

	public double getPrice() {
		return Price;
	}

	public Ride getRide() {
		return ride;
	}
	
	public String toString() {
		return (this.getDriver()+" | Offer price : " + this.getPrice() + "| Status: " + this.Accepted);

	}
	
	public void acceptOffer() {
		Accepted = true;
		noty.addAcceptedOffer(this);
	}
}
