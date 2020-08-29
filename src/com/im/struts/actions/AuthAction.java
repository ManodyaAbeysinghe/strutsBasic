package com.im.struts.actions;

public class AuthAction {

	String un,pw;
	
	
	//non argumented 
	
	public String getUn() {
		return un;
	}


	public void setUn(String un) {
		this.un = un;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String execute() {
		System.out.println("called..");
		try {
			if(un.contentEquals("admin")&& pw.contentEquals("654")) {
				return "success";
			}else {
				return "fail";
			}
			
			
			
		}catch(Exception e) {
			return "error";
		}
	}
}
