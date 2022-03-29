package com.bridgelabz;

public class Pigeon extends Bird implements Flyable{
	public Pigeon(String id) {
		this.id = id;
		name = "Pigeon";
		color = Color.GREEN;	
	}
	//	@Override
	//	void swim() {
	//		System.out.println(getClass().getSimpleName() + "can't swim");;
	//	}

	@Override
	public void flyable() {
		System.out.println("Pigeon can  fly");		

	}
}
