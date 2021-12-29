
public class Rider_Entity extends App_User {

		//Methods:
		public Rider_Entity() {}
		public Rider_Entity(String U_Username,String U_PhoneNumber,String U_Password,String U_email){
			this.Username=U_Username;
			this.PhoneNumber=U_PhoneNumber;
			this.Password=U_Password;
			this.email=U_email;
		}
		
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
		
		

		}
		
	


