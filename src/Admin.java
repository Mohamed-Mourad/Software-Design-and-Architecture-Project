import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends App_User {
	// Attributes:
	int count = 1;
	

	// Methods:
	//Methods:
		public  void setUsername(String Uname) {
			this.Username=Uname;
		}
		public  String getUname() {
			return Username;
		}
		public  void setPhoneNumber(String Pnum) {
			this.PhoneNumber=Pnum;
		}
		public  String getPhoneNumber() {
			return PhoneNumber;
		}
		public void setPassword(String pass) {
			this.Password=pass;
		}
		public  String getPassword() {
			return Password;
		}
		public  void setEmail(String em) {
			this.email=em;
		}
		public  String getEmail() {
			return email;
		}

	public void verifyDriver() {
		try {
			File myObj = new File("PendingDrivers.txt");
			File temp = new File("temp.txt");
			//BufferedReader reader = new BufferedReader(new FileReader(myObj));
			//BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
			// Scanner no = new Scanner(System.in);
			
			Scanner myReader = new Scanner(myObj);
			System.out.println("Which drivers do you want to approve ?(enter their numbers)");
			Scanner no = new Scanner(System.in);
			String s = no.nextLine();
			no.close();
			int cnt = 1;
			FileWriter VerifiedWriter = new FileWriter("VerifiedDrivers.txt");
			FileWriter myWriter = new FileWriter("temp.txt");
			PrintWriter pw1 = new PrintWriter(VerifiedWriter);
			PrintWriter pw2 = new PrintWriter(myWriter);
			while (myReader.hasNextLine()) {
				if (s.contains(String.valueOf(cnt))) {
					VerifiedWriter.write(myReader.nextLine());
					pw1.println(" ");
				} else if (!s.contains(String.valueOf(cnt))) {
					myWriter.write(myReader.nextLine());
					pw2.println(" ");
				}
				cnt++;
			}
			// myObj.delete();
			// temp.renameTo(myObj);
			myReader.close();
			VerifiedWriter.close();
			myWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void list() {
		try {
			File myObj = new File("PendingDrivers.txt");
			Scanner myReader = new Scanner(myObj);
			ArrayList<String> temps = new ArrayList<String>();

			while (myReader.hasNextLine()) {

				String data = myReader.nextLine();
				temps.add(count + ". " + data);
				// System.out.println(count);
				count++;

			}
			System.out.println(temps);
			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}