import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public abstract class App_User {

	// Attributes:
	String Username;
	int PhoneNumber;
	String Password;
	IRegister r;
	Rider rider1;

	public void Register(IRegister r) throws IOException {
		r.Register();
	}

	public void Login(App_User a) {
		System.out.println("Enter your username and password to login.");
		Scanner usrname = new Scanner(System.in);
		String u = usrname.nextLine();

		Scanner passwd = new Scanner(System.in);
		passwd.nextLine();
		String p = usrname.nextLine();
		try {
		if (a instanceof Rider) {
			

				File myObj = new File("E:\\Programs\\SoftwareArch\\Rider.txt");

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
			
		}

		else if (a instanceof Driver) {
			

				File myObj = new File("E:\\Programs\\SoftwareArch\\ApprovedDriver.txt");

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
			
		} else if (a instanceof Admin) {
			

				File myObj = new File("E:\\Programs\\SoftwareArch\\Admin.txt");

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
				usrname.close();
				passwd.close();
			
		}
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
