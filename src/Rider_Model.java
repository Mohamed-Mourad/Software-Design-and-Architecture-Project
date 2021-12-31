import java.util.ArrayList;

public class Rider_Model {
	Rider_Entity riderE = new Rider_Entity();
	static Notifications notify = new Notifications();
	ArrayList<Offer> Recieved_offers = new ArrayList<Offer>();
	ArrayList<Offer> AllOffers = notify.getOffers();

	Rider_Model() {

	}

	public ArrayList<Offer> readRecieved_offers() {
		return Recieved_offers;
	}

	public ArrayList<Offer> readAllOffers() {
		return AllOffers;
	}

	public void updateRecieved_offers(Offer o) {
		Recieved_offers.add(o);
	}

	public void updateAllOffers(Offer o) {
		AllOffers.add(o);
	}

	public void DeleteRecieved_offers(Offer o) {
		Recieved_offers.remove(o);
	}

	public void DeleteAllOffers(Offer o) {
		AllOffers.remove(o);
	}
}
