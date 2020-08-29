package com.im.struts.actions;

public class RegisterAction {

String un,pw, name;
	
	
	//non argumented 
	


	public String getUn() {
		return un;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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


	public String register() {
		System.out.println("called..");
		try {
			System.out.println("Name= "+name);
			System.out.println("UserName= "+un);
			System.out.println("Password= "+pw);
			return "success";
			
			
			
		}catch(Exception e) {
			return "error";
		}
	}
	
}
