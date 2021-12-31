public class Offer {
	
	private Driver driver;
	private Ride ride;
	private double Price;
	private Notifications noty = new Notifications();

	Offer(){}
	Offer(Driver driver, Ride ride, double Price) {
		this.driver = driver;
		this.ride = ride;
		this.Price = Price;
		noty.addOffer(this);
	}

	public Driver getDriver() {
		return driver;
	}

	public double getPrice() {
		return Price;
	}

	public Ride getRide() {
		return ride;
	}
	
	public String toString() {
		return (this.getDriver()+" | Offer price : " + this.getPrice()   );

	}
}
