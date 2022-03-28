package com.bridgelabz;

import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;

public class BirdRepository {

	//	private List birdList = new ArrayList<>();

	private Set birdList = new HashSet<>();

	public void setBirdList(Set birdList) {
		this.birdList = birdList;
	}

	public Set getBirdList() {
		return birdList;
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird parrot) {
		birdList.remove(parrot);
	}

	public void remove(Duck duck) {
		birdList.remove(duck);
	}

	Bird getBird(String id) {
		for (Bird bird : birdList){
			if(bird.id.equals(id)) {
				
			}
		}
	}
}