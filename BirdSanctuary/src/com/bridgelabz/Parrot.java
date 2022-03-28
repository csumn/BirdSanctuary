package com.bridgelabz;

public class Parrot extends Bird implements Flyable {

	public Parrot(String id) {
		this.id = id;
		name = "Parrot";
		color = Color.WHITE;
	}

	@Override
	public void flyable() {
		System.out.println("Parrot can  fly");		
	}

	//	@Override
	//	void swim() {
	//		System.out.println(getClass().getSimpleName() + " Cannot swim");
	//	}
}
