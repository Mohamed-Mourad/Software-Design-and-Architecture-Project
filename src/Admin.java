import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	//Attributes:
	int count = 1;
	Admin_Entity admin_entity;

	// Methods:

		public void verifyDriver() {
			try {
				File myObj = new File("PendingDrivers.txt");
				File temp = new File("temp.txt");
				if (!temp.exists()) {
					temp.createNewFile();
				}
			
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
				
//				File bsbs = new File("bsbs.txt");
//				if (!bsbs.exists()) {
//					bsbs.createNewFile();
//				}
//				boolean deleted = myObj.delete();
//				File toRename = new File("PendingDrivers.txt");
//				boolean successful=temp.renameTo(toRename);
//				System.out.println(successful);
//				System.out.println(deleted);
				
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