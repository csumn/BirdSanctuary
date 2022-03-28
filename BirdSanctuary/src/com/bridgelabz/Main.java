package com.bridgelabz;

public class Main {

	final static int MAIN_EXIT = 8;

	void handleUserOption(int selectedOptionIs) {

		switch (selectedOptionIs) {
		case 1:
			addBird();
			break;
		case 2:
			System.out.println("Enter the bird id of the bird which you want to remove ?");
			break;
		case 3:
			break;
		case 4:
			break;
		case MAIN_EXIT:
			System.out.println("Good Bye!");
			break;
		default:
			
		}
	}
	private void addBird() {
		//TODO Bird creation via USERINPUT
		Bird penguin = new Penguin("P001");
				Bird penguin2 = new Penguin("P001");
				Bird duck = new Duck("D001");
				Bird ostrich = new Ostrich("O001");
				Bird parrot = new Parrot("P001");
				Bird pigeon = new Pigeon("P001");
				
				Bird b = (Bird) pigeon;
		
				//	creating Database
				
				BirdRepository birdRepository = new BirdRepository();
				
				birdRepository.add(duck);
				birdRepository.add(ostrich);
				birdRepository.add(parrot);
				birdRepository.add(penguin);
				birdRepository.add(penguin2);
				birdRepository.add(pigeon);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to bird Sanctuary...");
		System.out.println(" ");

		UserInterface userInterface = new UserInterface();
		Main main = new Main();
		int selectedOptionIs;
		do {
			selectedOptionIs = userInterface.showMainMenu();
			main.handleUserOption(selectedOptionIs);
		}while(selectedOptionIs != MAIN_EXIT);



		//		
		//
		//		//	UI
		//		UserInterface userInterface = new UserInterface();
		//		userInterface.print(birdRepository.getBirdList());
		//		birdRepository.remove(parrot);
		//		birdRepository.remove(duck);
		//		System.out.println("  \n After removing two birds \n" );
		//		userInterface.print(birdRepository.getBirdList());
	}
}