import java.util.ArrayList;

public class Notifications {

//	ArrayList<Ride> announcedRides = new ArrayList<Ride>();
	static ArrayList<Ride> RequestedRides = new ArrayList<Ride>();
	static ArrayList<Offer> offers = new ArrayList<Offer>();
	static ArrayList<Offer> AcceptedOffers = new ArrayList<Offer>();

//	
//	public void addAnnounced(Ride ride) {
//		announcedRides.add(ride);
//	}
//	public void remAnnounced(Ride ride) {
//		announcedRides.remove(ride);
//	}
	public void addRequested(Ride ride) {
		RequestedRides.add(ride);
	}

	public ArrayList<Ride> getRequested() {
		return RequestedRides;
	}

	public void addOffer(Offer offer) {
		offers.add(offer);
	}

	public ArrayList<Offer> getOffers() {
		return offers;
	}
	
	public void addAcceptedOffer(Offer offer) {
		AcceptedOffers.add(offer);
	}

	public ArrayList<Offer> getAcceptedOffers() {
		return AcceptedOffers;
	}
}
