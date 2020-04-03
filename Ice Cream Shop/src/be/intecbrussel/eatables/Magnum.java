package be.intecbrussel.eatables;

public class Magnum implements Eatable{
	
	// Variable containing the type of magnum this magnumm is
	private MagnumType type;
	
	// Default constructor
	public Magnum() {
		
	}
	
	// Constructor where we set the type of magnum this magnum is
	public Magnum(MagnumType magType) {
		this.type = magType;
	}
	
	// Getter that tells us the type of magnum this is
	public MagnumType getType() {
		return this.type;
	}
	
	// Method that tells us what type of magnum we are eating
	public void eat() {
		System.out.println("You are eating a " + this.getType() + " magnum!");
	}

}
