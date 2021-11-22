import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;;
public class Main {
	public static void main(String[] args) throws IOException {
		int choice;
		//choose options
//		System.out.println("Please enter the number of how you want to be registered.");
//		System.out.println("1-Driver ");
//		System.out.println("2-Rider "); 
//		System.out.println("enter your choice: ");
//		Scanner c=new Scanner(System.in);
//        choice=c.nextInt();
//        
//        Admin admin = new Admin();
//        admin.list();
//        System.out.println("Verification");
//        admin.verifyDriver();
//        admin.list();
//       App_User rider = new Rider();
        
//        rider.Login(rider);
        
//       if(choice==1)
//        {	
//        // Driver test
// 
//    	   App_User driver = new Driver();
//    	   driver.Register(new Driver_Register());
//        }
//        /////////////
//       if(choice==2)
//        {
//        // Rider test
//        App_User rider = new Rider();
//        rider.Register(new Rider_Register());
//       
//        }		
        
        
        Ride ride = new Ride();
        Rider rider = new Rider();
        rider.ride = ride; 
      
        System.out.println("Enter your location.");
		Scanner src = new Scanner(System.in);
		String source = src.nextLine();
		ride.SetSource(source);
		
		System.out.println("Enter your destination.");
		Scanner dest = new Scanner(System.in);
		String destination = dest.nextLine();
		ride.SetDestination(destination);
	    rider.requestRide(source, destination);
	}
}
