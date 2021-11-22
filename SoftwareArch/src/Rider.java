import java.io.IOException;

public class Rider extends App_User  {
	//Attributes:
	String email;
	Rider rider;
	IRegister r;
	Ride ride;
	//Methods:
//	public Rider() {
	
//}
/*	public Rider(String U_Username,int U_PhoneNumber,String U_Password,String U_email){
		
	}
	public void Register(String U_Username,int U_PhoneNumber,String U_Password,String U_email) {
		this.Username=U_Username;
		this.PhoneNumber=U_PhoneNumber;
		this.Password=U_Password;
		this.email=U_email;
		
	}
	*/
//	public void Register(IRegister r) throws IOException 
//	{
//		r.register();
//	}
	
	public void requestRide(String source , String destination) {
		
		source = ride.getSource();
		destination = ride.getDestination();
		System.out.print(source);
		System.out.println(destination);
		
		
	}
	public void ViewDriverDetails() {}
	public void SelectOffer() {}
	public void NotifyAcceptedDriver() {}
	public void RateRide() {}
	public void AddRequestRideObserver() {}
	public void DeleteRequestRideObserver() {}
	public void NotifyRequestRideObserver() {}
	public void SetRequestRideState() {}
	public void AddAcceptOfferObserver() {}
	public void DeleteAcceptOfferObserver() {}
	public void NotifyAcceptOfferObserver() {}
	public void SetAcceptOfferState() {}
	public void GetOfferState() {}
	public void SetAnnounceRideState() {}
	public void UpdateRequestRide() {}
	public void UpdateOfferAcceptance() {}
	
}
