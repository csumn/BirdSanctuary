package com.bridgelabz;

import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;

public class BirdRepository {
	//	private List birdList = new ArrayList<>();
	private static BirdRepository instance;
	static String idOfBirdWhichNeedToBeEdited;

	public Set<Bird> birdList = new HashSet<>();

	private BirdRepository() {

	}
	static synchronized BirdRepository getInstance() {
		if(instance == null) {
			instance = new BirdRepository();
		}
		return instance;
	}
	Set getBirdList() {
		return birdList;
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
	}

	//	public void remove(Duck duck) {
	//		birdList.remove(duck);
	//	}

	Bird getBird(String id) {
		for (Bird bird : birdList){
			if(bird.id.equals(id)) {
				System.out.println("Bird found");
				return bird;
			}
		}
		System.out.println("Sorry Bird Not Found ...... ");
		return null;
	}
}






















//public void setBirdList(Set<Bird> birdList) {
//this.birdList = birdList;
//}

//public void setBirdList(Set birdList) {
//this.birdList = birdList;
//}

//public Set getBirdList() {
//return birdList;
//}