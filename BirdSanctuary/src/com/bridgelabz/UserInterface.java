package com.bridgelabz;

import java.util.Scanner;
//import java.util.List;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	static Scanner scanner = new Scanner(System.in);

	private UserInterface() {

	}
	static synchronized UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	int showMainMenu() {
		System.out.println("\nSelect any one from below options \n1. Add the birds\n2. Remove the birds\n"
				+ "3. Edit the bird list\n4. Printing the birds\n5. Print all flyable birds\n6. Print all swimmable birds\n"+Main.MAIN_EXIT+". Exit");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		return option;
	}



	void print(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			System.out.println(bird);
		}
	}

	void printFlyable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird.isFlyable) {
				System.out.println(bird.name+" can Fly ");
			}
			//				//		    	((Flyable) bird).flyable();
			//				Flyable flyable = (Flyable)bird;
			//				flyable.flyable();
			//			}
		}
		System.out.println("End of flyable bird list... ");
	}

	void printSwmmable(Set<Bird> birdList) {
		for (Bird bird : birdList) {
			if (bird.isSwimmable) {
				System.out.println(bird.name+" can swim ");
				//				Swimmable swimmableBird = (Swimmable)bird;
				//				swimmableBird.swimmable();

			}
		}
		System.out.println("End of swimmable bird list... ");
	}
	public static int showUpdateMenu(){
		System.out.println("\nEnter which field you would like to update/Edit ?\n"
				+ "1. id\n"
				+ "2. name\n"
				+ "3. coulor\n"
				+ Main.UPDATE_EXIT+". Exit\n");
		return(scanner.nextInt());		
	}
}

















//for ( int i = 0; i< birdList.size(); i++) {
//			System.out.println(birdList.get(i));
//		}