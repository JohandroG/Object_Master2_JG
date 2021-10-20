package com.objectmasterTest;
import com.objectmasterclasses.*;

public class HumanTest {

	public static void main(String[] args) {
	Human juanito =  new Human();
	Human pedro =  new Human();
	Samurai shinji =  new Samurai();
	Wizard warlock =  new Wizard();
	Ninja naturo = new Ninja();
	Samurai shamak =  new Samurai();
	
	pedro.attack(juanito);
	pedro.printStadistics();
	juanito.printStadistics();
//	==========================================================
	shinji.printStadistics();
	shinji.deathBlow(juanito);
	shinji.meditate();
	shinji.meditate();
	Samurai.howMany();
	shinji.printStadistics();
//	===========================================================
	warlock.printStadistics();
	warlock.heal(juanito);
	warlock.fireball(pedro);
	warlock.printStadistics();
//	===========================================================
	naturo.printStadistics();
	naturo.steal(juanito);
	naturo.runAway();
	naturo.printStadistics();
//	===========================================================
	pedro.printStadistics();
	juanito.printStadistics();
	
	
	

	}
}
