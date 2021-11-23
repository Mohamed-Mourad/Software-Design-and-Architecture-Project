
public class RiderRide extends Ride {

	//Attributes:
	String Source;
	String Destination;

	//Methods:
	public void SetSource(String source) {
		this.Source=source;
	}
	public void SetDestination(String destination) {
		this.Destination=destination;
	}
	public String getSource() {
		return Source;
	}
	public String getDestination() {
		return Destination;
	}
}
