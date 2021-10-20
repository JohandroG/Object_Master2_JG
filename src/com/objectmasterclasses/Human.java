package com.objectmasterclasses;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	
	public void attack(Human objetive) {
		objetive.health -= this.strength;
	}
	
	public void printStadistics() {
		System.out.println("Strength: " + this.strength + " Stealth: " + this.stealth + " Intelligence: " + this.intelligence + " Health: " + this.health );
		
	}
	
	
	
	
	
	
	
	
}
