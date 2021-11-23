import java.awt.List;
import java.util.ArrayList;
import java.util.Vector;

public class Rider extends App_User implements IRequestRideSubject{
	// Attributes:
	RiderRide ride = new RiderRide();
	Register r ;
	Driver d = new Driver();
	protected static ArrayList<Driver> drivers = new ArrayList<Driver>();

	// String source;
	// Methods:
	public Rider() {
	}

	public Rider(String U_Username, String U_PhoneNumber, String U_Password, String U_email) {
		this.Username = U_Username;
		this.PhoneNumber = U_PhoneNumber;
		this.Password = U_Password;
		this.email = U_email;
	}

	public void setUsername(String Uname) {
		this.Username = Uname;
	}

	public String getUname() {
		return Username;
	}

	public void setPhoneNumber(String Pnum) {
		this.PhoneNumber = Pnum;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPassword(String pass) {
		this.Password = pass;
	}

	public String getPassword() {
		return Password;
	}

	public void setEmail(String em) {
		this.email = em;
	}

	public String getEmail() {
		return email;
	}

	public void requestRide(String source, String destination) {

		source = ride.getSource();
		destination = ride.getDestination();
		System.out.println(source);
		System.out.println(destination);

	}

	
public void NotifyRequestRideObserver(){
			String s ;
			s=ride.getSource();
	        for (Driver driver : drivers) {
	            if(driver.getFavAreas().contains(s))
	                driver.UpdateRequestRide();
	        }
	    }
//		for (String f : d.FavAreas) {
//			if (f.equals(sourceRide)) {
//				System.out.println("ana fel for notify");
//				dr1.UpdateRequestRide();
//			}
//		}
	//}

	

	public void ViewDriverDetails() {
	}

	
	public void SelectOffer() {
	}

	public void NotifyAcceptedDriver() {
	}

	public void RateRide() {
	}

	public void AddRequestRideObserver(Driver dr) {
		drivers.add(dr);
	}



	public void SetRequestRideState() {
	}

	public void AddAcceptOfferObserver() {
	}

	public void DeleteAcceptOfferObserver() {
	}

	public void NotifyAcceptOfferObserver() {
	}

	public void SetAcceptOfferState() {
	}

	public void UpdateOffer() {
	}

	public void SetAnnounceRideState() {
	}

	public void UpdateRequestRide() {
	}

	public void UpdateOfferAcceptance() {
	}

}