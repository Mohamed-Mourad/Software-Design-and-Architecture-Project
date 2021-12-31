import java.util.ArrayList;

public class Rider_Controller {
	// Attributes:
	Rider_Model riderM = new Rider_Model();
	Ride ride;

	// Methods:
	public Rider_Controller() {

	}

	public void recieveOffer(Offer o) {
		System.out.println("You got a new offer " + riderM.riderE.Username + "\n");
		riderM.updateAllOffers(o);
	}

	public ArrayList<Offer> ListOffer(Ride ride) {
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

	public void requestRide(Ride r, String source, String destination) {
		r = new Ride();
		r.setSource(source);
		r.setDestination(destination);
		riderM.notify.addRequested(r);
	}

	public void rateCompletedRide(Ride ride, int rating) {
		// rateRide=new Rate();
		ride.rate.setRate(rating);
	}

}

/////////////////////////////////////////////////////////////
