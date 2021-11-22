import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;

public class Driver_Register implements IRegister{
	//Attributes:
	int NationalID;
	String DriverLicense;
	String username;
	String email;
	String phoneNumber;
	String password;
	public Driver_Register() {}
	public Driver_Register(String D_Username,String D_PhoneNumber,String D_Password,String D_email,int nationalId){
		this.username=D_Username;
		this.phoneNumber=D_PhoneNumber;
		this.password=D_Password;
		this.email=D_email;
		this.NationalID=nationalId;
		//this.Registered=reg;
		//count++;
		//Registered=false;
	}
	@Override
	
		public void Register() throws IOException{
			
			 try{
		          File file =new File(("E:\\Programs\\SoftwareArch\\PendingDrivers.txt"));
		          String str=null;
		    	  if(!file.exists()){
		    	 	file.createNewFile();
		    	  }
		    	  Reader r=new InputStreamReader(System.in);
		  		BufferedReader br= new BufferedReader(r);
				System.out.println("Please Type your info to register and hit Ctrl+z");
				System.out.println("Press enter after each one. ");
				System.out.println("Please Type your username , password , phone number , national ID , driving license and your email(optional) .");
		    	  FileWriter fw = new FileWriter(file,true);
		    	  BufferedWriter bw = new BufferedWriter(fw);
		    	  PrintWriter pw = new PrintWriter(bw);
		          //This will add a new line to the file content
		    	  pw.println(" ");
		          /* Below three statements would add three 
		           * mentioned Strings to the file in new lines.
		           */

		    		while((str=br.readLine())!=null ) {

						pw.write(str+" ");
					
					}
		    	  pw.close();
		    		System.out.println("Driver is registered");


		       }catch(IOException ioe){
		    	   System.out.println("Exception occurred:");
		    	   ioe.printStackTrace();
		      }
		   }
/*	public  String register(String fileName, String content) throws IOException {
        Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
        return "Driver has been registered";*/

}
