package com.tomtom.api;

import com.tomtom.model.User;
import com.tomtom.utility.Utility;

//@Path
public class UserDetailsAPI {
	
	/*@POST
	@Path("/address")
	@Produces(MediaType.APPLICATION_JSON)*/
	public void saveAddress(/*@FormParam("name")*/ String name, String address, String mobileno){
		
		if(Utility.isEmpty(name)){
			//Response sent
			System.out.println("Please provide name");
			//return Response Object
		}
		
		if(Utility.isEmpty(address)){
			//Response sent
			System.out.println("Please provide address");
			//return Response Object
		}
		
		if(!Utility.isValid(mobileno)){
			//Response sent
			System.out.println("Please provide address");
			//return Response Object
		}
		
		String latlon = null; //get Latitude & Longitude bases on pin code
		User user = new User();
		user.setName(name);
		user.setMobileno(Long.parseLong(mobileno));
		user.setAddressCordinates(latlon);
		//saveUserDetailsInDB()  return if save successfully return true else return false
		boolean flag = true;
		if(flag){
			//Response sent
			System.out.println("Data Saved in database");
			//return Response Object
		}else{
			//Response sent
			System.out.println("Please provide correct details. Something went wrong.");
			//return Response Object
		}
	}
}
