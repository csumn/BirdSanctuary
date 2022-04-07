package com.bridgelabz;

import java.util.Scanner;

import com.bridgelabz.Bird.Color;

public class Main {

	final static int MAIN_EXIT = 7;
	final static int UPDATE_EXIT = 4;

	void handleUserOption(int selectedOptionIs) {
		Scanner scanner = new Scanner(System.in);
		BirdRepository birdRepository = BirdRepository.getInstance();
		UserInterface userInterface = UserInterface.getInstance();

		switch (selectedOptionIs) {
		case 1: //add
			addBird();
			break;
		case 2: //remove
			if (birdRepository.birdList.size()!=0) {
				System.out.println("Enter the id of the bird which you would like to remove ?");
				String idOfRemovingBird = scanner.nextLine();
				Bird removingBird = birdRepository.getBird(idOfRemovingBird);
				birdRepository.remove(removingBird);
				if(removingBird != null) {
					System.out.println(removingBird+ " removed sucessfully ..");
				}
			}else {
				System.out.println("Oops...As of now, Bird set is empty....");
			}
			break;
		case 3: //edit
			editBird();
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
		case 5:
			userInterface.printFlyable(birdRepository.birdList);
			break;
		case 6:
			userInterface.printSwmmable(birdRepository.birdList);
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

	private void handleUpdateUserSelection(int outputFromUserForUpdateMenu,Bird editedBird) {
		BirdRepository birdRepository = BirdRepository.getInstance();
		Scanner scanner = new Scanner(System.in);

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
			System.out.println("Select any number for selecting color from below");
			setColor(editedBird);
			break;
		case 4:
			System.out.println("Edit option got terminated and redirected to main menu.... ");
			break;

		default:
			System.out.println("Kindly check and enter a valid input....");
			break;
		}
	}

	private void setColor(Bird editedBird) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. RED\n"
				+ "2. GREEN\n"
				+ "3. WHITE\n"
				+ "4. BLACK_WHITE\n"
				+ "5. BLACK");

		int selectedOptionForColor = scanner.nextInt();
		switch (selectedOptionForColor) {
		case 1:
			System.out.println("You have selected Red");
			editedBird.color = Color.RED;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 2:
			System.out.println("You have selected Green");
			editedBird.color = Color.GREEN;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 3:
			System.out.println("You have selected WHITE");
			editedBird.color = Color.WHITE;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 4:
			System.out.println("You have selected BLACK_WHITE");
			editedBird.color = Color.BLACK_WHITE;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		case 5:
			System.out.println("You have selected BLACK");
			editedBird.color = Color.BLACK;
			System.out.println("Color was edited Sucessfully:)");
			System.out.println(editedBird);
			break;
		default:
			System.out.println("Kindly Select valid color...");
			break;
		}
	}
	private void addBird() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		Bird bird = new Bird();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name of the bird : ");
		bird.name = scanner.nextLine();

		System.out.println("Enter id of the bird : ");
		bird.id = scanner.nextLine();

		System.out.println("Is it flyable ? enter true or false ");
		bird.isFlyable = scanner.nextBoolean();

		System.out.println("is it Swimmable ? ? enter true or false ");
		bird.isSwimmable = scanner.nextBoolean();

		setColor(bird);
		birdRepository.add(bird);
	}

	private void editBird() {
		BirdRepository birdRepository = BirdRepository.getInstance();
		String idOfBirdWhichNeedToBeEdited;
		Bird editedBird;
		Scanner scanner = new Scanner(System.in);
		int outputFromUserForUpdateMenu;
		if (birdRepository.birdList.size()!=0) {
			System.out.println("Enter the Bird id which you would like to edit from the birds");
			idOfBirdWhichNeedToBeEdited = scanner.nextLine();
			editedBird = birdRepository.getBird(idOfBirdWhichNeedToBeEdited);
			if (editedBird != null) {
				System.out.println(editedBird);
				do {
					outputFromUserForUpdateMenu  = UserInterface.showUpdateMenu();
					handleUpdateUserSelection(outputFromUserForUpdateMenu,editedBird);
				}while(outputFromUserForUpdateMenu != UPDATE_EXIT);

			}
		}else {
			System.out.println("Oops...As of now, Bird set is empty....");
		}		
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
	}
}
