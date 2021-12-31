import java.util.ArrayList;

public class Rider {
	// Attributes:
	static Notifications notify=new Notifications();
	Rider_Entity rider_entity;
	Ride ride;
	Driver_Controller dr;
	private ArrayList<Driver_Controller> drivers = new ArrayList<Driver_Controller>();
	private ArrayList<Offer> Recieved_offers = new ArrayList<Offer>();
	ArrayList<Offer> AllOffers = notify.getOffers();



	// Methods:
	public Rider() {
		rider_entity = new Rider_Entity();
	}

	public void recieveOffer(Offer o) {
		System.out.println("You got a new offer " + rider_entity.Username + "\n");
		Recieved_offers.add(o);
	}

	public ArrayList<Offer> ListOffer(Ride ride) {
		AllOffers.forEach(O -> {
			if (O.getRide() == ride) {
				Recieved_offers.add(O);
			}
		});
		return Recieved_offers;
	}
	
	public void RiderAcceptOffer(Offer O) {
		O.acceptOffer();
	}

	public void requestRide(Ride r,String source,String destination) {
		r=new Ride();
		r.setSource(source);
		r.setDestination(destination);
        notify.addRequested(r);
	}

	public void NotifyRequestRideObserver() {

		for (Driver_Controller driver : drivers) {
			if (driver.driverM.driverE.FavAreas.Sources.contains(ride.getSource())) {
				driver.UpdateRequestRide();
			}
		}

	}
	

	public void rateCompletedRide(Ride ride,int rating) {
		//rateRide=new Rate();
          ride.rate.setRate(rating);
	}

}

/////////////////////////////////////////////////////////////
