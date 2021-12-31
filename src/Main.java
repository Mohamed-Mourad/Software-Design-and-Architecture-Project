import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		/*
		 * Admin admin = new Admin(); Rider rider; Driver driver=new Driver();; Scanner
		 * in = new Scanner(System.in); String choice; while(true){
		 * System.out.println("Choose account type: "); System.out.println("1-Driver ");
		 * System.out.println("2-Rider "); System.out.println("3-Admin "); choice =
		 * in.nextLine(); ///////////////////////////////////////////////////// // In
		 * case 1 was Chosen -> Driver Choice
		 * 
		 * if(choice.equalsIgnoreCase("1")){
		 * System.out.println("Please Choose one of the following");
		 * System.out.println("1.register"); System.out.println("2.login"); choice =
		 * in.nextLine();
		 * 
		 * if(choice.equalsIgnoreCase("1")){ App_User driverE = new Driver_Entity();
		 * 
		 * String Driving_License; int Nationalid; String Username; String PhoneNumber;
		 * String Password; String email;
		 * 
		 * System.out.println("Please enter username:"); Username = in.nextLine();
		 * 
		 * System.out.print("Please enter Password: "); Password= in.nextLine();
		 * 
		 * System.out.print("Please enter Email: (Optional)-(Press enter to skip): ");
		 * email = in.nextLine();
		 * 
		 * System.out.println("Please enter Phone Number: "); PhoneNumber =
		 * in.nextLine();
		 * 
		 * System.out.println("Please enter your National ID: "); Nationalid =
		 * in.nextInt();
		 * 
		 * 
		 * System.out.println("Please enter your Driving License number: ");
		 * Driving_License =in.nextLine();
		 * 
		 * driverE = new
		 * Driver_Entity(Username,PhoneNumber,Password,email,Nationalid,Driving_License)
		 * ; driverE.register(driverE);
		 * 
		 * System.out.
		 * println("Your registration is pending...waiting for admin approval");
		 * 
		 * }else if(choice.equalsIgnoreCase("2")){
		 * 
		 * App_User driverE = new Driver_Entity();
		 * 
		 * System.out.println("Enter User Name: "); String Username = in.nextLine();
		 * driverE.setUsername(Username);
		 * 
		 * System.out.println("Enter Password: "); String Password = in.nextLine();
		 * driverE.setPassword(Password);
		 * 
		 * driverE.Login(driverE);
		 * 
		 * System.out.println("Please Choose one of the following");
		 * System.out.println("1.Add Favourite area");
		 * System.out.println("2.Remove Favourite area");
		 * 
		 * String Driver_Choice; Driver_Choice=in.nextLine();
		 * if(Driver_Choice.equalsIgnoreCase("1")) { boolean wantContinue = true;
		 * //driver=new Driver(); while (wantContinue) {
		 * System.out.println("Add your fav area."); //Scanner areaToAdd = new
		 * Scanner(System.in); String ar = in.nextLine(); driver. AddFavArea(ar);
		 * System.out.println(driver.getFavAreas());
		 * System.out.println("Do you stop adding areas?");
		 * System.out.println("1. yes"); System.out.println("2. no");
		 * System.out.println("3. to remove a favourite area.");
		 * 
		 * Scanner c = new Scanner(System.in); int n = c.nextInt(); if(n == 1) {
		 * wantContinue = false; } else if(n == 2) { wantContinue = true; } else if(n ==
		 * 3) { System.out.println("Enter area you wish to remove.");
		 * System.out.println(driver.getFavAreas()); String removeA = in.nextLine();
		 * driver.removeFavArea(removeA); wantContinue = true; } }
		 * 
		 * }else{ continue; }
		 * 
		 * 
		 * }
		 * 
		 * ///////////////////////////////////////////////////////////// // In case 2
		 * was Chosen -> Rider Choice if(choice.equalsIgnoreCase("2")){
		 * System.out.println("Please Choose one of the following");
		 * System.out.println("1.register"); System.out.println("2.login"); choice =
		 * in.nextLine();
		 * 
		 * if(choice.equalsIgnoreCase("1")){ App_User riderE = new Rider_Entity();
		 * String Username; String PhoneNumber; String Password; String email;
		 * 
		 * System.out.println("Please enter username:"); Username = in.nextLine();
		 * System.out.print("Please enter Password: "); Password= in.nextLine();
		 * System.out.print("Please enter Email: (Optional)-(Press enter to skip): ");
		 * email = in.nextLine(); System.out.println("Please enter Phone Number: ");
		 * PhoneNumber = in.nextLine();
		 * 
		 * // public Rider_Entity(String U_Username,String U_PhoneNumber,String
		 * U_Password,String U_email) riderE = new
		 * Rider_Entity(Username,PhoneNumber,Password,email); riderE.register(riderE);
		 * System.out.println("Rider is registered");
		 * 
		 * }else if(choice.equalsIgnoreCase("2")){
		 * 
		 * Rider_Entity riderE = new Rider_Entity();
		 * System.out.println("Enter User Name: "); String Username = in.nextLine();
		 * riderE.setUsername(Username);
		 * 
		 * System.out.println("Enter Password: "); String Password = in.nextLine();
		 * riderE.setPassword(Password);
		 * 
		 * riderE.Login(riderE); ////////////////////////////////////////////////////
		 * System.out.println("Please Choose one of the following");
		 * System.out.println("1.Request ride");
		 * 
		 * String Rider_Choice; Rider_Choice=in.nextLine();
		 * if(Rider_Choice.equalsIgnoreCase("1")) {
		 * System.out.println("Enter Source: "); String sourcee = in.nextLine();
		 * System.out.println("Enter Destination: "); String dest = in.nextLine(); //
		 * rider = (Rider_Entity) riderE; RideRequest ride_request=new
		 * RideRequest(riderE,sourcee,dest);
		 * 
		 * } ////////////////////////////////////
		 * 
		 * 
		 * }else{ continue; } }
		 * /////////////////////////////////////////////////////////////// // In case 3
		 * was Chosen -> Admin Choice
		 * 
		 * if(choice.equalsIgnoreCase("3")){
		 * System.out.println("Please Choose one of the following");
		 * System.out.println("1.register"); System.out.println("2.login"); choice =
		 * in.nextLine();
		 * 
		 * if(choice.equalsIgnoreCase("1")){ App_User adminE = new Admin_Entity();
		 * String Username; String PhoneNumber; String Password; String email;
		 * 
		 * System.out.println("Please enter username:"); Username = in.nextLine();
		 * System.out.print("Please enter Password: "); Password= in.nextLine();
		 * System.out.print("Please enter Email: (Optional)-(Press enter to skip): ");
		 * email = in.nextLine(); System.out.println("Please enter Phone Number: ");
		 * PhoneNumber = in.nextLine();
		 * 
		 * // public Rider_Entity(String U_Username,String U_PhoneNumber,String
		 * U_Password,String U_email) adminE = new
		 * Admin_Entity(Username,PhoneNumber,Password,email); adminE.register(adminE);
		 * System.out.println("Admin is registered");
		 * 
		 * }else if(choice.equalsIgnoreCase("2")){
		 * 
		 * App_User adminE = new Admin_Entity();
		 * System.out.println("Enter User Name: "); String Username = in.nextLine();
		 * adminE.setUsername(Username);
		 * 
		 * System.out.println("Enter Password: "); String Password = in.nextLine();
		 * adminE.setPassword(Password);
		 * 
		 * adminE.Login(adminE);
		 * 
		 * System.out.println("Please Choose one of the following");
		 * System.out.println("1.Verify Drivers");
		 * 
		 * //Admin ad = (Admin) admin; admin.list(); admin.verifyDriver();
		 * 
		 * }else{ continue; } }
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 */

		/*
		 * d.AddFavArea("October"); d.AddFavArea("dod"); Rider_Entity riderE=new
		 * Rider_Entity(); Rider_Entity riderE2=new Rider_Entity(); Rider_Entity
		 * riderE3=new Rider_Entity(); Notifications n = new Notifications();
		 * System.out.println("Enter you source and destination"); Scanner in = new
		 * Scanner(System.in); String source=in.nextLine(); String destination =
		 * in.nextLine(); Ride r = new Ride(riderE,source , destination);
		 * n.addRequested(r); System.out.println(n.getRequested());
		 * System.out.println(d.SeeNotifications(n)); //Ride r = new Ride(riderE,source
		 * , destination); Ride r2 = new Ride(riderE2,"2" , "2"); Ride r3= new
		 * Ride(riderE3,"3" , "3"); System.out.println(r.getID());
		 * System.out.println(r2.getID()); System.out.println(r3.getID());
		 */

		Driver_Controller d = new Driver_Controller();

		d.DriverAddFavArea("haram");
		Notifications n = new Notifications();
		System.out.println(d.DrivergetFavAreas());
		Rider rider = new Rider();
		Rider_Entity riderE = new Rider_Entity("mado", "phonenum", "pass", "email");

		Ride ride = new Ride(riderE, "haram", "bola2");

		rider.requestRide(ride, "haram", "bola2");

		System.out.println(d.SeeRequestNotifications(n));
		// n.addRequested(ride);

		d.Offer(d, ride, 40.5);

		// n.addOffer(offer);
		System.out.println(rider.ListOffer(ride));
		System.out.println("-----------------------------------");

		rider.RiderAcceptOffer(rider.ListOffer(ride).get(0));
		System.out.println(d.SeeOfferNotifications(n));

		System.out.println("-----------------------------------");
		d.EndRide(ride);
		ride.addTobalance(d, 40.5);
		System.out.println(d.driverM.driverE.getDriverBalance());
		d.addToRideHistory(ride);
		System.out.println(d.getRideHistory());

		System.out.println("-----------------------------------");
		rider.rateCompletedRide(ride, 3);
		System.out.println(ride.getMyRate(ride));

	}
}
