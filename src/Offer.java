public class Offer {
	
	private Driver driver;
	private Ride ride;
	private double Price;

	Offer(){}
	Offer(Driver driver, Ride ride, double Price) {
		this.driver = driver;
		this.ride = ride;
		this.Price = Price;

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
