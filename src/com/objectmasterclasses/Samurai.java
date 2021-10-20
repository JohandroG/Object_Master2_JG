package com.objectmasterclasses;

public class Samurai {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 200;
	private static int numSamurai = 0;
	
	
	public Samurai() {
        Samurai.numSamurai += 1;
    }
	
	public void deathBlow(Human objetive) {
		objetive.health -= objetive.health;
		System.out.println("The human has dead");
		this.health -= this.health/2;
	}
	
	public void meditate() {
		System.out.println("Meditating...");
		this.health += this.health/2;
	}
	
	public static void howMany() {
        System.out.println("There are: " + numSamurai +" samurais");
    }
	
	public void printStadistics() {
		System.out.println("Strength: " + this.strength + " Stealth: " + this.stealth + " Intelligence: " + this.intelligence + " Health: " + this.health );
		
	}
	
	
}
