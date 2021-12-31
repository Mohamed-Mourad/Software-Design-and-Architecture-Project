import java.util.ArrayList;

public class Driver_Model {
	Driver_Entity driverE = new Driver_Entity();
	ArrayList<Ride_Controller> rideHistory = new ArrayList<Ride_Controller>();
	ArrayList<Ride_Controller> rides_inFav = new ArrayList<Ride_Controller>();
	ArrayList<Offer> myAcceptedOffers = new ArrayList<Offer>();

	Driver_Model() {
		
	}

	public void create() {

	}

	public ArrayList<Ride_Controller> readHistory() {
		return rideHistory;
	}

	public ArrayList<Ride_Controller> readFavList() {
		return rides_inFav;
	}

	public ArrayList<Offer> readmyAcceptedOffers() {
		return myAcceptedOffers;
	}

	public void updateRideHistory(Ride_Controller r) {
		rideHistory.add(r);
	}

	public void updateFavList(Ride_Controller r) {
		rides_inFav.add(r);
	}

	public void updatemyAcceptedOffers(Offer o) {
		myAcceptedOffers.add(o);
	}
	public void DeleteRideHistory(Ride_Controller r) {
		rideHistory.remove(r);
	}

	public void DeleteFavList(Ride_Controller r) {
		rides_inFav.remove(r);
	}

	public void DeleteAcceptedOffers(Offer o) {
		myAcceptedOffers.remove(o);
	}
}
