public class Driver_Entity extends App_User {
	// Attributes:
	Boolean Approved;
	int NationalID;
	String Driving_License;
	double DriverBalance;
	Rider_Controller rider;
	static int id = 1;
	int Did;
	Fav_Areas FavAreas = new Fav_Areas();

	// Methods:
	public Driver_Entity() {
		Username = "";
		email = "";
		Password = "";
		PhoneNumber = "";
		Driving_License = "";
		NationalID = 0;
		DriverBalance = 0;
		this.Did = id++;
	}

	public Driver_Entity(String D_Username, String D_PhoneNumber, String D_Password, String D_email, int nationalId,
			String DL) {
		this.Username = D_Username;
		this.PhoneNumber = D_PhoneNumber;
		this.Password = D_Password;
		this.email = D_email;
		this.NationalID = nationalId;
		this.Approved = false;
		this.Driving_License = DL;
		id++;
	}

	// public Driver(String D_Username, String D_PhoneNumber, String D_Password,
	// String D_email, int nationalId, String DL,
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
	public void setDriverBalance(double balance) {
		this.DriverBalance=balance;
	}

	public double getDriverBalance() {
		return DriverBalance;
	}
	public int getDriverID() {
		return this.id;
	}

}