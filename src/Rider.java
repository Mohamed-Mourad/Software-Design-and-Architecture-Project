import java.util.ArrayList;

public class Rider  {
	//Attributes:
	Rider_Entity rider_entity;
	Ride ride;
	Driver dr;
	private ArrayList<Driver> drivers = new ArrayList<Driver>();
	 private ArrayList<Offer> offers = new ArrayList<Offer>();
	//Methods:
	public Rider()  {rider_entity= new Rider_Entity();}
	  public void recieveOffer(Offer o){
	        System.out.println("You got a new offer "+rider_entity.Username+"\n");
	        offers.add(o);
	    }
	   
	public void requestRide(String source , String destination) {
		
		source = ride.getSource();
		destination = ride.getDestination();	
		
	}
	
	public void NotifyRequestRideObserver() {

		for (Driver driver : drivers) {
			if (driver.FavAreas.contains(ride.getSource())) {
				driver.UpdateRequestRide();
			}
		}

	}
	/*   public void request(String src, String dst){
    RideRequest.publishRequest(this, src, dst);
}*/

public void selectOffer(Offer o){

}
public void rateCompletedRide(){
    
}

}

/////////////////////////////////////////////////////////////

  

 

