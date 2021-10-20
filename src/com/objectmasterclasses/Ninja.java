package com.objectmasterclasses;

public class Ninja {
	protected int strength = 3;
	protected int stealth = 10;
	protected int intelligence = 3;
	protected int health = 100;
	
	public void steal(Human objetive) {
		this.health += this.stealth;
		objetive.health -= this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
	}
	
	public void printStadistics() {
		System.out.println("Strength: " + this.strength + " Stealth: " + this.stealth + " Intelligence: " + this.intelligence + " Health: " + this.health );
		
	}
	
	
}
