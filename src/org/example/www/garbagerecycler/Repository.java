package org.example.www.garbagerecycler;
/**
 * @author Oneto, Fernando
 * @author Diez, Lautaro
 */

import java.util.ArrayList;
import java.util.List;

public class Repository {
	protected List<User> userList; 
	protected List<UserRecycling> userRecyclingList;
	
	private static final float BOTTLESWEIGHT = 0.1f; // weights are in Kg
	private static final float TETRABRIKSWEIGHT = 0.04f;
	private static final float PAPAERBOARDWEIGHT = 0.02f;
	private static final float GLASSWEIGHT = 0.3f;
	private static final float CANSWEIGHT=  0.07f;
	
	private static Repository _instance = null;
	
	private Repository () {
		userList = new ArrayList<> ();
		userRecyclingList = new ArrayList <> ();
	}
	
	public static Repository Instance() {
		if (_instance == null) 
			_instance = new Repository();
		return _instance;
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public void addUserRecycling(UserRecycling ur) {
		userRecyclingList.add(ur);
	}
	
	public int getUserAmount() {
		return userList.size();
	}
	
	public int getUserRecyclingAmount() {
		return userRecyclingList.size();
	}
	
	// Get the User from a given username
	public User getUserByUsername (String username) {
		for (User user : userList) {
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		return new User();
	}
	
	// Get all user recycling from a given username
	public UserRecycling [] getAllUserRecycling (String username) {
		List<UserRecycling> returnList = new ArrayList<>(); 
		for (UserRecycling userRecycling : userRecyclingList) {
			if (userRecycling.getUser().getUsername().equalsIgnoreCase(username)) {
				returnList.add(userRecycling); 
			}
		}
		return (UserRecycling[]) returnList.toArray(new UserRecycling[returnList.size()]);
	}
	
	// Get all user recycling amount from a given username
	public Recycling getAllRecycling(String username) {
		Recycling recycling = new Recycling();
		int bottles = 0, tetrabriks=0, paperboard=0, glass=0, cans = 0;
		for (UserRecycling userRecycling : userRecyclingList) {
			if (userRecycling.getUser().getUsername().equalsIgnoreCase(username)) {
				bottles += userRecycling.getBottles();
				tetrabriks += userRecycling.getTetrabriks();
				paperboard += userRecycling.getPaperboard();
				glass += userRecycling.getGlass();
				cans += userRecycling.getCans();
			}
		}
		float tons = bottles * BOTTLESWEIGHT + tetrabriks * TETRABRIKSWEIGHT + paperboard * PAPAERBOARDWEIGHT + glass * GLASSWEIGHT + cans * CANSWEIGHT;
		tons = tons /1000; // parsing kg to tons
		recycling.setBottles(bottles);
		recycling.setTetrabriks(tetrabriks);
		recycling.setPaperboard(paperboard);
		recycling.setGlass(glass);
		recycling.setCans(cans);
		recycling.setTons(tons);
		return recycling;
	}
}
