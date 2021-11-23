import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class Register {

	public abstract String filename();

	public void register(App_User a) throws IOException {

		try {
			File file = new File((filename()));
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

			if (a instanceof Driver) {
				Driver d = (Driver) a;
				pw.write(d.getNationalID() + " ");
				pw.write(d.getDrivingLicence() + " ");
				System.out.println("Driver is registered");
			}

			if (a instanceof Rider) {

				System.out.println("Rider is registered");
			}
			if (a instanceof Admin) {

				System.out.println("Admin is registered");
			}
			pw.close();

		} catch (IOException ioe) {
			System.out.println("Exception occurred:");
			ioe.printStackTrace();
		}
	}

}