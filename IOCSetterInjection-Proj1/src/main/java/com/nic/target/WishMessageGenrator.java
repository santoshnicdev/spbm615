package com.nic.target;

import java.util.Date;

public class WishMessageGenrator {
	private String msg;
	private Date date;
	
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	public String showGreetings(String user)
	{
		System.out.println("WishMessageGenerator.generateMessage()");
		//get current hour of the day
		int hour=date.getHours(); // 24 hours format (0 to 23)
		//generate wish messsage
		 if(hour<12)
			 return "Good Morning::"+user;
		 else if(hour<16)
			 return "Good AfterNoon::"+user;
		 else if(hour<20)
			 return "Good Evening::"+user;
		 else
			 return "Good Night::"+user;
	}
	

}
