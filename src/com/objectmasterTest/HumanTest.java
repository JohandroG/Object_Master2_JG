package com.objectmasterTest;
import com.objectmasterclasses.*;

public class HumanTest {

	public static void main(String[] args) {
	Human juanito =  new Human();
	Human pedro =  new Human();
	
	pedro.attack(juanito);
	juanito.printStadistics();
	
	}
}
