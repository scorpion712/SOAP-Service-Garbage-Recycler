package org.example.www.garbagerecycler;
/**
 * @author Oneto, Fernando
 * @author Diez, Lautaro
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * GarbageRecyclerSkeleton java skeleton for the axisService
 */
public class GarbageRecyclerSkeleton {

	public org.example.www.garbagerecycler.RegisterUserResponse registerUser(
			org.example.www.garbagerecycler.RegisterUser registerUser) {
		RegisterUserResponse response = new RegisterUserResponse();
		Repository repositoryInstance = Repository.Instance();
		User user = registerUser.getUser(); // get user's data
		repositoryInstance.addUser(user); // save the user
		user.setId(repositoryInstance.getUserAmount()); // set the user id
		response.setOut(user); // set the response
		return response;
	}

	public org.example.www.garbagerecycler.AddRecyclingToUserResponse addRecyclingToUser(
			org.example.www.garbagerecycler.AddRecyclingToUser addRecyclingToUser) {
		AddRecyclingToUserResponse response = new AddRecyclingToUserResponse();
		Repository repositoryInstance = Repository.Instance();
		String username = addRecyclingToUser.getUsername(); // get the username
		User user = repositoryInstance.getUserByUsername(username); // look for the user with that username
		UserRecycling userRecycling = addRecyclingToUser.getUserRecycling();
		userRecycling.setUser(user);
		userRecycling.setDate(new Date()); // set the Date
		repositoryInstance.addUserRecycling(userRecycling);
		userRecycling.setId(repositoryInstance.getUserRecyclingAmount()); // set the UserRecycling id
		response.setUserRecycling(userRecycling); // set the response

		return response;
	}

	public org.example.www.garbagerecycler.GetAllRecyclingFromUserResponse getAllRecyclingFromUser(
			org.example.www.garbagerecycler.GetAllRecyclingFromUser getAllRecyclingFromUser) {
		GetAllRecyclingFromUserResponse response = new GetAllRecyclingFromUserResponse();
		Repository repositoryInstance = Repository.Instance();
		String username = getAllRecyclingFromUser.getUsername(); // get the User
		UserRecycling[] listUserRecycling = repositoryInstance.getAllUserRecycling(username); // get the user recycling list given by username
		response.setList(listUserRecycling); // set the list to the response

		return response;
	}

	public org.example.www.garbagerecycler.GetAllRecyclingResponse getAllRecycling(
			org.example.www.garbagerecycler.GetAllRecycling getAllRecycling) {
		GetAllRecyclingResponse response = new GetAllRecyclingResponse();
		Repository repositoryInstance = Repository.Instance();
		String username = getAllRecycling.getUsername(); // get the username
		Recycling allRecycling = repositoryInstance.getAllRecycling(username);	// get all the recycling for the given username
		response.setRecycling(allRecycling); // set all recycling to the response

		return response;
	}

}
