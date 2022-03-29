package com.bridgelabz;

import java.util.Scanner;

import com.bridgelabz.Bird.Color;

public class Main {
	Bird editedBird;
	static String idOfBirdWhichNeedToBeEdited;
	//		BirdRepository birdRepository = BirdRepository.getInstance();
	//		UserInterface userInterface = UserInterface.getInstance();
	//	UserInterface userInterface = new UserInterface();
	Scanner scanner = new Scanner(System.in);
	final static int MAIN_EXIT = 8;


	void handleUserOption(int selectedOptionIs) {
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();

		switch (selectedOptionIs) {
		case 1: //add
			addBird();
			break;
		case 2: //remove
			if (birdRepository.birdList.size()!=0) {
				System.out.println("Enter the id of the bird which you would like to remove ?");
				String id = scanner.nextLine();
				Bird removingBird = birdRepository.getBird(id);
				birdRepository.remove(removingBird);
				if(removingBird != null) {
					System.out.println(removingBird+ " removed sucessfully ..");
				}
			}else {
				System.out.println("Oops...As of now, Bird set is empty....");
			}
			break;
		case 3: //edit
			if (birdRepository.birdList.size()!=0) {

				System.out.println("Enter the Bird id which you would like to edit from the birds");
				idOfBirdWhichNeedToBeEdited = scanner.nextLine();
				editedBird = birdRepository.getBird(idOfBirdWhichNeedToBeEdited);
				if (editedBird != null) {
					System.out.println(editedBird);
					int outputFromUserForUpdateMenu  = UserInterface.showUpdateMenu();
					handleUpdateUserSelection(outputFromUserForUpdateMenu);
				}
			}else {
				System.out.println("Oops...As of now, Bird set is empty....");
			}
			break;
		case 4: //Print
			if (birdRepository.birdList.size()!=0) {

				System.out.println("\n *****Here is the updated Bird Set***** \n");
				userInterface.print(birdRepository.getBirdList());
			}
			else {
				System.out.println("Oops...As of now, Bird set is empty....");
			}
			break;
		case MAIN_EXIT:
			System.out.println("Good Bye!");
			break;
		default:
		{  
			System.out.println("Kindly enter a valid input");
		}
		}
	}



	private void handleUpdateUserSelection(int outputFromUserForUpdateMenu) {
		BirdRepository birdRepository = BirdRepository.getInstance();



		switch (outputFromUserForUpdateMenu) {
		case 1:
			System.out.println("Enter new Id : ");
			String newId = scanner.nextLine();
			editedBird.id = newId;
			System.out.println("Id was edited Sucessfully:)");
			break;
		case 2:
			System.out.println("Enter new Name : ");
			String newName = scanner.nextLine();
			editedBird.name = newName;
			System.out.println("Name was edited Sucessfully:)");
			break;
		case 3:
			System.out.println("Not Yet started ....");
			//			System.out.println("Enter new color : ");
			//			String newColor = scanner.nextLine();
			//			editedBird.color = newColor;
			break;

		default:
			System.out.println("Kindly check and enter a valid input....");
			break;
		}
	}


	private void addBird() {
		//TODO Bird creation via USERINPUT

		Bird penguin = new Penguin("Penguin001");
		Bird penguin2 = new Penguin("penguin002");
		Bird duck = new Duck("duck001");
		Bird ostrich = new Ostrich("ostrich001");
		Bird parrot = new Parrot("parrot001");
		Bird pigeon = new Pigeon("pigeon001");

		Bird b = (Bird) pigeon;

		//	creating Database
		BirdRepository birdRepository = BirdRepository.getInstance();

		birdRepository.add(duck);
		birdRepository.add(ostrich);
		birdRepository.add(parrot);
		birdRepository.add(penguin);
		birdRepository.add(penguin2);
		birdRepository.add(pigeon);

		System.out.println("Birds added Successfully ...! ");
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
