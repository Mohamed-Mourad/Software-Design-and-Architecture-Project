import java.util.ArrayList;

public class Driver {

	// Attributes:
	Notifications notify = new Notifications();
	Driver_Entity driver_entity;
	Fav_Areas FavAreas = new Fav_Areas();
	// Fav_Areas FavAreas;
	Admin admin;
	Offer offer = new Offer();
	ArrayList<Ride> rideHistory = new ArrayList<Ride>();
	ArrayList<Ride> availableRequests = new ArrayList<Ride>();
	static int driverID = 1;
	int id;
	// Methods:

	public Driver() {

		driver_entity = new Driver_Entity();
		this.id = driverID++;
	}


	public ArrayList<Ride> SeeNotifications(Notifications n) {
		ArrayList<Ride> temp = n.getRequested();
		ArrayList<Ride> rides_inFav = new ArrayList<Ride>();
		temp.forEach(riderequest -> {
			if(FavAreas.Sources.contains(riderequest.getSource())) {
				rides_inFav.add(riderequest);
			}
		});

		return rides_inFav;
	}

	public void offerPrice(double price, Driver driver) {

		// notifyme.addOffer();

	}

	public void DriverAddFavArea(String Area) {
		FavAreas.AddFavArea(Area);
	}

	public ArrayList<String> DrivergetFavAreas() {
		return FavAreas.getFavAreas();
	}

	public String DriverRemoveFavArea(String area) {
		return FavAreas.removeFavArea(area);
	}

	public void UpdateRequestRide() {
		System.out.println("You've got a ride in your favourite areas.");
	}

	public void Offer(Driver driver, Ride ride, double price) {
		offer = new Offer(this, ride, price);
		System.out.println(ride);
	}

	public int getDriverID() {
		return this.id;
	}

	public String toString() {
		return ("Driver id: " + this.getDriverID());

	}

	public void EndRide(Ride r) {
	}

	public void AnnounceRide() {
	}

	public void SetAnnounceRideState() {
	}

	/////////////////////////////////////////////////////////////////////////

}