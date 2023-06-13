package com.toursystem;

public class ForgetPassword {
	
	 private String email;
	 private String user_id;
	 private String new_password;
	 private String confirm_password;
	 
	 
	public ForgetPassword(String email, String user_id, String new_password, String confirm_password) {
		
		this.email = email;
		this.user_id = user_id;
		this.new_password = new_password;
		this.confirm_password = confirm_password;
		
		}


	public String getEmail() {
		return email;
	}


	public String getUser_id() {
		return user_id;
	}


	public String getNew_password() {
		return new_password;
	}


	public String getConfirm_password() {
		return confirm_password;
	}


}
