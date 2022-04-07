package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		System.out.println("*** Welcome to Multithreading  *** ");
		System.out.println("\nMain Thread started \n");
		NumberThread numberThread = new NumberThread();
		CharacterRunnable characterRunnable = new CharacterRunnable();
		Thread characterThread = new Thread(characterRunnable);

		numberThread.start();
		characterThread.start();	
		System.out.println("Main Thread Completed");
	}
}























//NumberThread numberThread = new NumberThread();
//		numberThread.start();
//		CharacterRunnable characterRunnable = new CharacterRunnable();
//		characterRunnable.run();