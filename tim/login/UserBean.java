package com.regnant.tim.login;

public class UserBean {

		String first_name,last_name,city,state,email_id,pan_no;
		int mobile,pincode;
		public void setFirstName(String first_name) {
			this.first_name=first_name;
		}
		public String getFirstName() {
			return first_name;			
		}
		public void setLastName(String last_name) {
			this.last_name=last_name;
		}
		public String getLastName() {
			return last_name;			
		}
		public void setCity(String city) {
			this.city=city;
		}
		public String getCity() {
			return city;			
		}
		public void setState(String state) {
			this.state=state;
		}
		public String getState() {
			return state;			
		}
		public void setEmail(String email) {
			this.email_id=email;
		}
		public String getEmail() {
			return email_id;			
		}
		public void setPan(String pan) {
			this.pan_no=pan;
		}
		public String getPan() {
			return pan_no;			
		}
		public void setMobile(int mobile) {
			this.mobile=mobile;
		}
		public int getMobile() {
			return mobile;			
		}
		public void setPincode(int pincode) {
			this.pincode=pincode;
		}
		public int getPincode() {
			return pincode;			
		}
}
