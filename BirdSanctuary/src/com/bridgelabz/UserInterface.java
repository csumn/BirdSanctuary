package com.bridgelabz;

import java.util.Scanner;
//import java.util.List;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	Scanner scanner = new Scanner(System.in);

	private UserInterface() {

	}
	static synchronized UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	int showMainMenu() {
		System.out.println("Select any one from below options \n\n1. Add the birds\n2. Remove the birds\n"
				+ "3. Edit the bird list\n4. Printing the birds\n" +Main.MAIN_EXIT+". Exit");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		return option;
	}
	
	int showUpdateMenu(){
		System.out.println("Enter which field you would like to update .."
				+ "1. id"
				+ "2. name"
				+ "3. coulor");
		 int option =  scanner.nextInt();
		 return option;
	}

	void print(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			System.out.println(bird);
		}
	}

	void printFlyable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird instanceof Flyable) {
				//		    	((Flyable) bird).flyable();
				Flyable flyable = (Flyable)bird;
				flyable.flyable();
			}
		}
	}

	void printSwmmable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (birdList instanceof Swimmable) {
				Swimmable swimmableBird = (Swimmable)bird;
				swimmableBird.swimmable();

			}
		}
	}
}

















//for ( int i = 0; i< birdList.size(); i++) {
//			System.out.println(birdList.get(i));
//		}