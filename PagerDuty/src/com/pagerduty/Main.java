package com.pagerduty;

import java.io.IOException;
import com.google.gson.internal.*;
import java.util.*;

import com.google.gson.internal.StringMap;
import com.to.Contact;
import com.to.User;
import com.to.Users;

// Address book
// Useful Info
// Web app/ cli

public class Main {
	static String url="https://api.pagerduty.com/users?total=false";
	@SuppressWarnings("all")
	public static void main(String args[]) {
       
		Util util= new Util();
		try {
			int offset=0;
			int limit=25;
			int size=25;
			String include="contact_methods";
			while(limit==size) {		
				
			boolean total=false;
			String response =util.httpGetRequest(url+"limit="+limit+"&offset="+offset+"&total="+total+"&include%5B%5D="+include);			
			Users users=util.parseJsonToObject(response,Users.class);
			offset=limit+offset;
			List<User> usrl=users.users;
			 size=usrl.size();
		    	for(User usr:usrl) {
		    		System.out.println(usr.name+" & "+usr.email);
		    		ArrayList < Contact >  contact=usr.contact_methods;
		    		for(Contact ob:contact) {
		    			System.out.println("           "+ob.getType()+"-"+ob.getAddress());
		    		}
		    	}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	private void callUsersService() {
		
	}

	
}

