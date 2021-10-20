package com.objectmasterclasses;

public class Wizard {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 8;
	protected int health = 50;
	
	public void heal(Human objetive) {
		objetive.health -= this.intelligence;
	}
	
	public void fireball(Human objetive) {
		objetive.health -= this.intelligence;
	}
	
	public void printStadistics() {
		System.out.println("Strength: " + this.strength + " Stealth: " + this.stealth + " Intelligence: " + this.intelligence + " Health: " + this.health );
		
	}
	
	
}
