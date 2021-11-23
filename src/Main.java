import java.util.Scanner;
import java.io.IOException;
//import java.nio.file.*;;

public class Main {
	public static void main(String[] args) throws IOException {

		int ChoiceLR;
		System.out.println("What do you want to do?");
		System.out.println("1-Register");
		System.out.println("2-Log in ");
		System.out.println("3-verifyDrivers ");
		
		Scanner LR = new Scanner(System.in);
		ChoiceLR = LR.nextInt();
		// LR.close();
		int AccType;
		if (ChoiceLR == 1) {
			System.out.println("Choose account type: ");
			System.out.println("1-Driver ");
			System.out.println("2-Rider ");
			System.out.println("3-Admin ");

			Scanner scanner = new Scanner(System.in);
			AccType = scanner.nextInt();
			
			// AcTy.close();
			String Username;
			String PhoneNumber;
			String Password;
			String email;
			if (AccType == 1) {
				String Driving_License;
				int Nationalid;
				Driver driver = new Driver();

				System.out.println("Please enter username:");
				Scanner uname = new Scanner(System.in);
				Username = uname.nextLine();
				driver.setUsername(Username);

				System.out.println("Please enter Password ");
				Scanner passwd = new Scanner(System.in);
				Password = passwd.nextLine();
				driver.setPassword(Password);

				System.out.println("Please enter Phone Number: ");
				Scanner unum = new Scanner(System.in);
				PhoneNumber = unum.nextLine();
				driver.setPhoneNumber(PhoneNumber);

				System.out.println("Please enter your email");
				Scanner umail = new Scanner(System.in);
				email = umail.nextLine();
				driver.setEmail(email);

				System.out.println("Please enter your National ID");
				Scanner id = new Scanner(System.in);
				Nationalid = id.nextInt();
				driver.setNationalID(Nationalid);

				System.out.println("Please enter your Driving License number");
				Scanner license = new Scanner(System.in);
				Driving_License = license.nextLine();
				driver.setDrivingLicense(Driving_License);

				uname.close();
				passwd.close();
				unum.close();
				umail.close();
				id.close();
				license.close();

				driver.Register(new Driver_Register(), driver);

//					
			}

			if (AccType == 2) {
				App_User rider = new Rider();

				System.out.println("Please enter username:");
				Scanner uname = new Scanner(System.in);
				Username = uname.nextLine();
				rider.setUsername(Username);

				System.out.println("Please enter Password ");
				Scanner passwd = new Scanner(System.in);
				Password = passwd.nextLine();
				rider.setPassword(Password);

				System.out.println("Please enter Phone Number: ");
				Scanner unum = new Scanner(System.in);
				PhoneNumber = unum.nextLine();
				rider.setPhoneNumber(PhoneNumber);

				System.out.println("Please enter your email");
				Scanner umail = new Scanner(System.in);
				email = umail.nextLine();
				rider.setEmail(email);

				uname.close();
				passwd.close();
				unum.close();
				umail.close();

				rider.Register(new Rider_Register(), rider);
			}
			if (AccType == 3) {
				App_User admin = new Admin();

				System.out.println("Please enter username:");
				Scanner uname = new Scanner(System.in);
				Username = uname.nextLine();
				admin.setUsername(Username);

				System.out.println("Please enter Password ");
				Scanner passwd = new Scanner(System.in);
				Password = passwd.nextLine();
				admin.setPassword(Password);

				System.out.println("Please enter Phone Number: ");
				Scanner unum = new Scanner(System.in);
				PhoneNumber = unum.nextLine();
				admin.setPhoneNumber(PhoneNumber);

				System.out.println("Please enter your email");
				Scanner umail = new Scanner(System.in);
				email = umail.nextLine();
				admin.setEmail(email);
				
				admin.Register(new Admin_Register(), admin);

				uname.close();
				passwd.close();
				unum.close();
				umail.close();				
			}
			//scanner.close();
		}

		if (ChoiceLR == 2) {
			System.out.println("Choose account type: ");
			System.out.println("1-Driver ");
			System.out.println("2-Rider ");
			System.out.println("3-Admin ");

			Scanner scanner = new Scanner(System.in);
			AccType = scanner.nextInt();
			
			if (AccType == 1) {
				App_User driver = new Driver();
				driver.Login(driver);
			}
			if (AccType == 2) {
				App_User rider = new Rider();
				rider.Login(rider);
			}
			if (AccType == 3) {
				Admin admin = new Admin();
				admin.Login(admin);
			}
			//scanner.close();
		}
		if(ChoiceLR == 3) {
			App_User admin = new Admin();
			Admin ad = (Admin) admin;
			ad.list();
			ad.verifyDriver();
		}
		if(ChoiceLR == 4) {
			
		}
		if(ChoiceLR == 5) {
			
		}
		LR.close();
	}
}

