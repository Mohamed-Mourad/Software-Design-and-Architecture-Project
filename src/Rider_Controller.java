import java.util.ArrayList;

public class Rider_Controller {
	// Attributes:
	Rider_Model riderM = new Rider_Model();
	Ride_Controller ride;

	// Methods:
	public Rider_Controller() {

	}

	public Rider_Controller(String n, String b, String p, String e) {
		this.riderM.riderE.setUsername(n);
		this.riderM.riderE.setPhoneNumber(b);
		this.riderM.riderE.setPassword(p);
		this.riderM.riderE.setEmail(e);
	}

	public void recieveOffer(Offer o) {
		System.out.println("You got a new offer " + riderM.riderE.Username + "\n");
		riderM.updateAllOffers(o);
	}

	public ArrayList<Offer> ListOffer(Ride_Controller ride) {
		riderM.readAllOffers().forEach(O -> {
			if (O.getRide() == ride) {
				riderM.updateRecieved_offers(O);
			}
		});
		return riderM.readRecieved_offers();
	}

	public void RiderAcceptOffer(Offer O) {
		O.acceptOffer();
	}

	public void requestRide(Ride_Controller r, String source, String destination) {
		r = new Ride_Controller();
		r.rideM.rideE.setSource(source);
		r.rideM.rideE.setDestination(destination);
		riderM.notify.addRequested(r);
	}

	public void rateCompletedRide(Ride_Controller ride, int rating) {
		// rateRide=new Rate();
		ride.rideM.rideE.rate.setRate(rating);
	}

}

/////////////////////////////////////////////////////////////
