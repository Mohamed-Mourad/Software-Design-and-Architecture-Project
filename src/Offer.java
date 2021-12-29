public class Offer {
    private Driver driver;
    private Ride ride;
    private String source;
    private String destination;
    private float Price;

    Offer(Driver driver, Ride ride, float Price){
    	this.driver = driver;
        this.ride =ride	;
    	this.Price = Price;
    	
    }
    public Driver getDriver(){
        return driver;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public float getPrice(){
        return Price;
    }
}
