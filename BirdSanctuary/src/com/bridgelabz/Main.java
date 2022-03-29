package com.bridgelabz;

import java.util.Scanner;

public class Main {
	//	BirdRepository birdRepository = BirdRepository.getInstance();
	//	UserInterface userInterface = UserInterface.getInstance();
	//	UserInterface userInterface = new UserInterface();
	Scanner scanner = new Scanner(System.in);
	final static int MAIN_EXIT = 8;


	void handleUserOption(int selectedOptionIs) {
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();

		switch (selectedOptionIs) {
		case 1:
			addBird();
			break;
		case 2:
			System.out.println("Enter the bird id of the bird which you want to remove ?");
			String id = scanner.nextLine();
			Bird removingBird = birdRepository.getBird(id);
			birdRepository.remove(removingBird);
			break;
		case 3:
			System.out.println("Enter the bird Id");
			String id2 = scanner.nextLine();
			Bird editBird = birdRepository.getBird(id2);
			handleUpdateUserSelection(userInterface.showUpdateMenu());
			break;
		case 4:
			userInterface.print(birdRepository.getBirdList());
			break;
		case MAIN_EXIT:
			System.out.println("Good Bye!");
			break;
		default:

		}
	}
	private void handleUpdateUserSelection(int showUpdateMenu) {
//		switch (key) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
	}
	private void addBird() {
		//TODO Bird creation via USERINPUT

		Bird penguin = new Penguin("P001");
		Bird penguin2 = new Penguin("P002");
		Bird duck = new Duck("D001");
		Bird ostrich = new Ostrich("O001");
		Bird parrot = new Parrot("P003");
		Bird pigeon = new Pigeon("P004");

		Bird b = (Bird) pigeon;

		//	creating Database
		BirdRepository birdRepository = BirdRepository.getInstance();

		birdRepository.add(duck);
		birdRepository.add(ostrich);
		birdRepository.add(parrot);
		birdRepository.add(penguin);
		birdRepository.add(penguin2);
		birdRepository.add(pigeon);

		System.out.println("Birds added ");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to bird Sanctuary...");
		System.out.println(" ");
		UserInterface userInterface = UserInterface.getInstance();

		Main main = new Main();
		int selectedOptionIs;
		do {
			selectedOptionIs = userInterface.showMainMenu();
			main.handleUserOption(selectedOptionIs);
		}while(selectedOptionIs != MAIN_EXIT);


		//		
		//
		//		//	UI
		//						UserInterface userInterface = new UserInterface();
		//						userInterface.print(birdRepository.getBirdList());
		//						birdRepository.remove(parrot);
		//						birdRepository.remove(duck);
		//						System.out.println("  \n After removing two birds \n" );
		//						userInterface.print(birdRepository.getBirdList());
	}
}
