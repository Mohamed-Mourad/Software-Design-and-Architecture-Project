import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public abstract class App_User {
	// Attributes:
	String Username;
	String PhoneNumber;
	String Password;
	String email;
	

	public abstract void setUsername(String Uname);

	public abstract String getUname();

	public abstract void setPhoneNumber(String Pnum);

	public abstract String getPhoneNumber();

	public abstract void setPassword(String pass);

	public abstract String getPassword();

	public abstract void setEmail(String em);

	public abstract String getEmail();


	public void Login(App_User a) {
		File myObj = new File(" ");
		try {
			if (a instanceof Rider_Entity) {

				myObj = new File("Rider.txt");
			} else if (a instanceof Driver_Entity) {

				myObj = new File("VerifiedDrivers.txt");
			} else if (a instanceof Admin_Entity) {
                  myObj = new File("Admin.txt");
                  
			}
			Scanner myReader = new Scanner(myObj);
			boolean noBreak = true;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				if (myReader.findInLine(a.Username) != null && myReader.findInLine(a.Password) != null) {

					System.out.println("Logged Succesfully.");
					noBreak = false;
					break;
				}

			}
			if (noBreak) {
				System.out.println("Login failed.");

			}
		
			myReader.close();
			//usrname.close();
		//	passwd.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public void register(App_User a) throws IOException {
		File file = new File(" ");
		try {
			if (a instanceof Rider_Entity) {

				file = new File("Rider.txt");
			} else if (a instanceof Driver_Entity) {

				file = new File("PendingDrivers.txt");
			} else if (a instanceof Admin_Entity) {
                  file = new File("Admin.txt");
                  
			}
		//	File file = new File((filename()));
			// String str=null;
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw);

			// This will add a new line to the file content

			pw.println(" ");

			pw.write(a.getUname() + " ");
			pw.write(a.getPassword() + " ");
			pw.write(a.getPhoneNumber() + " ");
			pw.write(a.getEmail() + " ");

			if (a instanceof Driver_Entity) {
				Driver_Entity d = (Driver_Entity) a;
				pw.write(d.getNationalID() + " ");
				pw.write(d.getDrivingLicence() + " ");
			}

			pw.close();

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

}
