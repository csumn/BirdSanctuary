package com.bridgelabz;

public class CharacterRunnable implements Runnable{

	@Override
	public void run() {
		for (char i = 65; i <=90; i++) {
			System.out.println(i);
		}
		System.out.println("CharacterRunnable Thread Completed");
	}

}
