import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver extends App_User  implements IRequestRide{
	// Attributes:

	Boolean Approved;
	int NationalID;
	String Driving_License;
	ArrayList<String> FavAreas = new ArrayList<String>();
	Float DriverBalanace;
	Rider rider ;

	// Methods:
	public Driver() {
	}

	public Driver( Rider r) {
		
		this.rider = r;
	    this.rider.AddRequestRideObserver(this);
	}
//	public Driver(String D_Username, String D_PhoneNumber, String D_Password, String D_email, int nationalId, String DL,
//			boolean reg, Rider r) {
//		this.Username = D_Username;
//		this.PhoneNumber = D_PhoneNumber;
//		this.Password = D_Password;
//		this.email = D_email;
//		this.NationalID = nationalId;
//		this.Approved = reg;
//		this.Driving_License = DL;
//		this.rider = r;
//	    this.rider.AddRequestRideObserver(this);
//	}

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

//////////////////////////
	public void setNationalID(int national) {
		this.NationalID = national;
	}

	public int getNationalID() {
		return NationalID;
	}

	public void setDrivingLicense(String DL) {
		this.Driving_License = DL;
	}

	public String getDrivingLicence() {
		return Driving_License;
	}

	/*
	 * public void Approved() { Approved=true;
	 * 
	 * } public void PendingRegisteration() {
	 * System.out.println("Your Registration is pending until approval by an Admin."
	 * ); Approved=false;
	 * 
	 * }
	 */
	///////////////////////////////////////////////////////////////////////
	

    
	public void AddFavArea() {
		boolean wantContinue = true;
		ArrayList<String> FavAreas = new ArrayList<String>();
		while (wantContinue) {
			System.out.println("Add your fav area.");
			Scanner areaToAdd = new Scanner(System.in);
		    String ar = areaToAdd.nextLine();
			FavAreas.add(ar);
			System.out.println(FavAreas);
			System.out.println("Do you stop adding areas?");
			System.out.println("1. yes");
			System.out.println("2. no");
		
			Scanner c = new Scanner(System.in);
			int n = c.nextInt();
			if(n == 1) {
				wantContinue = false;
			}
			else if(n == 2) {
				wantContinue = true;
			}
		}
		
	}
	
	
	public ArrayList<String> getFavAreas(){
        return FavAreas;
    }
	public void Offer() {
	}

	public void EndRide() {
	}

	public void AnnounceRide() {
	}

	public void AddAnnounceRideStateObserver() {
	}

	public void DeleteAnnounceRideStateObserver() {
	}

	public void NotifyAnnounceRideStateObserver() {
	}

	public void SetAnnounceRideState() {
	}

	public void AddOfferObserver() {
	}

	public void DeleteOfferObserver() {
	}

	public void NotifyOfferObserver() {
	}

	public void SetOfferState() {
	}

	public void UpdateRequestRide() {
		System.out.println("You've got a ride in your favourite areas.");
		}
	

	public void UpdateAcceptOffer() {
	}

	public void UpdateOffer() {
	}

	public void UpdateAnnouncedRides() {
		
	}
}