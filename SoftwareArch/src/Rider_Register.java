import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;


public class Rider_Register  implements IRegister{
	String username;
	String email;
	String phoneNumber;
	String password;
	
	public Rider_Register(String U_Username,String U_PhoneNumber,String U_Password,String U_email) {
		this.username=U_Username;
		this.phoneNumber=U_PhoneNumber;
		this.password=U_Password;
		this.email=U_email;
	}
	public Rider_Register() {}
	@Override
	public void Register() throws IOException{
		
		 try{
	          File file =new File(("E:\\Programs\\SoftwareArch\\Rider.txt"));
	          String str=null;
	    	  if(!file.exists()){
	    	 	file.createNewFile();
	    	  }
	    	  Reader r=new InputStreamReader(System.in);
	  		BufferedReader br= new BufferedReader(r);
			System.out.println("Please Type your info to register and hit Ctrl+z");
			System.out.println("Press enter after each one. ");
			System.out.println("Please Type your username , password , phone number and your email(optional) .");
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
	    		System.out.println("Rider is registered");


	       }catch(IOException ioe){
	    	   System.out.println("Exception occurred:");
	    	   ioe.printStackTrace();
	      }
	   }
	
	}
//C:\Users\Doaa\eclipse-workspace\Software_Architecture1