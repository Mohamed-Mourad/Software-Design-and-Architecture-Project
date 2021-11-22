import java.io.IOException;

public class Driver extends App_User  {
	//Attributes:
static int count;
	String email;
	boolean Registered;
	int NationalID;
	//static Driver[] driverObj ;
	 String[] FavAreas;
	Float DriverBalanace;
	//Driver driver;
	IRegister r;

	//Methods:

	/*public Driver(String D_Username,int D_PhoneNumber,String D_Password,String D_email,int nationalId,boolean reg){
		this.Username=D_Username;
		this.PhoneNumber=D_PhoneNumber;
		this.Password=D_Password;
		this.email=D_email;
		this.NationalID=nationalId;
		this.Registered=reg;
		//count++;
		//Registered=false;
		//Register();}*/
		

/*	 public void displayDrivers()
	    {if (Registered==false) {
	        System.out.println("Username is: " + Username + " "
	                           + "\nPhone number is: "
	                           + PhoneNumber +" "+ "\nemail is: "+ email+ "\nnational id is :"+ NationalID);
	        System.out.println();
	    }
	    }*/
	
	/* public  void AddToPendingList(Driver d)
	    {  count++;
	       driverObj= new Driver[count] ;
	       driverObj[count-1]= d;
	          
	    }
	 public static Driver ViewPendingList() {
		 return driverObj[count-1];
	 }*/
	
//	public void Register(IRegister r) throws IOException 
//	{
//      
//		r.register();
//		
//	}
	public void Approved() {
		Registered=true;

	}
	
	public void PendingRegisteration() {
		System.out.println("Your Registration is pending until approval by an Admin.");
		
		Registered=false;
				
	}
	
/*	public void Register(Driver d) {
		AddToPendingList(d);
		
		
	}
	*/
	
	public void AddFavArea(){}
	public void Offer(){}
	public void EndRide(){}
	public void AnnounceRide(){}
	public void AddAnnounceRideStateObserver(){}
	public void DeleteAnnounceRideStateObserver(){}
	public void NotifyAnnounceRideStateObserver(){}
	public void SetAnnounceRideState(){}
	public void AddOfferObserver(){}
	public void DeleteOfferObserver(){}
	public void NotifyOfferObserver(){}
	public void SetOfferState(){}
	public void GetRequestRideState(){}
	public void GetAcceptOfferState(){}
	public void UpdateOffer(){}
	public void UpdateAnnouncedRides(){}
}
