import java.util.ArrayList;

public class Driver_Model {
	Driver_Entity driverE = new Driver_Entity();
	ArrayList<Ride> rideHistory = new ArrayList<Ride>();
	ArrayList<Ride> rides_inFav = new ArrayList<Ride>();
	ArrayList<Offer> myAcceptedOffers = new ArrayList<Offer>();

	Driver_Model() {
		// this.driverE = D;
	}

	public void create() {

	}

	public ArrayList<Ride> readHistory() {
		return rideHistory;
	}

	public ArrayList<Ride> readFavList() {
		return rides_inFav;
	}

	public ArrayList<Offer> readmyAcceptedOffers() {
		return myAcceptedOffers;
	}

	public void updateRideHistory(Ride r) {
		rideHistory.add(r);
	}

	public void updateFavList(Ride r) {
		rides_inFav.add(r);
	}

	public void updatemyAcceptedOffers(Offer o) {
		myAcceptedOffers.add(o);
	}
	public void DeleteRideHistory(Ride r) {
		rideHistory.remove(r);
	}

	public void DeleteFavList(Ride r) {
		rides_inFav.remove(r);
	}

	public void DeleteAcceptedOffers(Offer o) {
		myAcceptedOffers.remove(o);
	}
}
