import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public abstract class App_User {
	// Attributes:
	String Username;
	String PhoneNumber;
	String Password;
	String email;
	Register r;

	public abstract void setUsername(String Uname);

	public abstract String getUname();

	public abstract void setPhoneNumber(String Pnum);

	public abstract String getPhoneNumber();

	public abstract void setPassword(String pass);

	public abstract String getPassword();

	public abstract void setEmail(String em);

	public abstract String getEmail();

	public void Register(Register r, App_User a) throws IOException {
		r.register(a);
	}

	public void Login(App_User a) {

		System.out.println("Enter User Name: ");
		Scanner usrname = new Scanner(System.in);
		String u = usrname.nextLine();
		System.out.println("Enter Password: ");
		Scanner passwd = new Scanner(System.in);
		String p = passwd.nextLine();
		File myObj = new File("");
		try {
			if (a instanceof Rider) {

				myObj = new File("Rider.txt");
			} 
			else if (a instanceof Driver) {
				Driver dr = (Driver) a;
				myObj = new File("VerifiedDrivers.txt");
			} 
			else if (a instanceof Admin) {
				Admin ad = (Admin) a;
				myObj = new File("Admin.txt");
			}
			Scanner myReader = new Scanner(myObj);
			boolean noBreak = true;
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				if (myReader.findInLine(u) != null && myReader.findInLine(p) != null) {

					System.out.println("Logged Succesfully.");
					noBreak = false;
					break;
				}

			}
			if (noBreak) {
				System.out.println("Login failed.");

			}
			myReader.close();

			myReader.close();
			usrname.close();
			passwd.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}