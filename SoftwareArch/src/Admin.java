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
	String email;
	String AdminID;
	int count = 1;

	// Methods:

	public void Register(IRegister r) throws IOException {

	}

	public void Login() {

	}

	public void verifyDriver() {
		try {
			File myObj = new File("E:\\Programs\\SoftwareArch\\PendingDrivers.txt");
			File temp = new File("E:\\Programs\\SoftwareArch\\temp.txt");
			//BufferedReader reader = new BufferedReader(new FileReader(myObj));
			//BufferedWriter writer = new BufferedWriter(new FileWriter(temp));
			// Scanner no = new Scanner(System.in);
			/*
			 * String lineToRemove=no.nextLine(); String CurrentLine;
			 * while((CurrentLine=reader.readLine())!=null) { String
			 * trimmedLine=CurrentLine.trim(); if(trimmedLine.equals(lineToRemove))
			 * continue;
			 * 
			 * writer.write(CurrentLine+System.getProperty("line.separator")); }
			 * writer.close(); reader.close(); boolean success=temp.renameTo(myObj);
			 * 
			 * } catch (FileNotFoundException e) { System.out.println("An error occurred.");
			 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
			 * block e.printStackTrace(); } }
			 */
			Scanner myReader = new Scanner(myObj);
			System.out.println("Which drivers do you want to approve ?(enter their numbers)");
			Scanner no = new Scanner(System.in);
			String s = no.nextLine();
			no.close();
			int cnt = 1;
			FileWriter VerifiedWriter = new FileWriter("E:\\Programs\\SoftwareArch\\VerifiedDrivers.txt");
			FileWriter myWriter = new FileWriter("E:\\Programs\\SoftwareArch\\temp.txt");
			PrintWriter pw1 = new PrintWriter(VerifiedWriter);
			PrintWriter pw2 = new PrintWriter(myWriter);
			while (myReader.hasNextLine()) {
				// String data = myReader.nextLine();
				// System.out.println(data);
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
			File myObj = new File("E:\\Programs\\SoftwareArch\\PendingDrivers.txt");
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