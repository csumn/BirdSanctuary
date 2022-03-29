package com.bridgelabz;

public class Duck extends Bird implements Flyable, Swimmable {

	public Duck(String id) {
		this.id = id;
		this.name = "Duck";
		color = Color.BLACK_WHITE;
	}

	@Override
	public void flyable() {
		System.out.println("Suck can Fly" );
	}

	@Override
	public void swimmable() {
		System.out.println("Ducl can swim" );
	}

}
