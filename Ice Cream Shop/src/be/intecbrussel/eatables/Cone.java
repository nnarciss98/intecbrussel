package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements Eatable{
	
	// Array that contains the flavours of each ball this cone has
	private Flavor[] balls;
	
	
	// Constructor
	public Cone() {
		
	}
	
	// Constructor that sets the flavours of the balls
	public Cone(Flavor[] flavorArray) {
		this.balls = flavorArray;
	}
	
	// Getter of the flavours of the balls
	public Flavor[] getBalls() {
		return this.balls;
	}
	
	// We print out what we eat
	public void eat() {
		System.out.println("The ice cream cone you ate had :" + Arrays.toString(this.getBalls()));
	}

}
