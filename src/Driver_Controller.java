import java.util.ArrayList;

public class Driver_Controller {

	// Attributes:
	Driver_Model driverM = new Driver_Model();
	Offer offer = new Offer();

	// Methods:

	public Driver_Controller() {

	}

	public ArrayList<Ride_Controller> SeeRequestNotifications(Notifications n) {
		ArrayList<Ride_Controller> temp = n.getRequested();
		temp.forEach(riderequest -> {
			if (driverM.driverE.FavAreas.Sources.contains(riderequest.rideM.rideE.getSource())) {
				driverM.updateFavList(riderequest);
			}
		});
		return driverM.rides_inFav;
	}

	public ArrayList<Offer> SeeOfferNotifications(Notifications n) {
		ArrayList<Offer> temp = n.getAcceptedOffers();
		temp.forEach(offer -> {
			if (offer.getDriver().driverM.driverE.getDriverID() == this.driverM.driverE.getDriverID()) {
				driverM.updatemyAcceptedOffers(offer);
			}
		});
		return driverM.myAcceptedOffers;
	}

	public void DriverAddFavArea(String Area) {
		driverM.driverE.FavAreas.AddFavArea(Area);
	}

	public ArrayList<String> DrivergetFavAreas() {
		return driverM.driverE.FavAreas.getFavAreas();
	}

	public String DriverRemoveFavArea(String area) {
		return driverM.driverE.FavAreas.removeFavArea(area);
	}

	public void UpdateRequestRide() {
		System.out.println("You've got a ride in your favourite areas.");
	}

	public void Offer(Driver_Controller driver, Ride_Controller ride, double price) {
		offer = new Offer(this, ride, price);
		System.out.println(ride);
	}

	public String toString() {
		return ("Driver id: " + this.driverM.driverE.Did);

	}

	public void EndRide(Ride_Controller r) {
		r.rideM.rideE.completed = true;
	}

	public void addToRideHistory(Ride_Controller r) {
		driverM.updateRideHistory(r);
	}

	public ArrayList<Ride_Controller> getRideHistory() {
		return driverM.readHistory();
	}

	/////////////////////////////////////////////////////////////////////////

}