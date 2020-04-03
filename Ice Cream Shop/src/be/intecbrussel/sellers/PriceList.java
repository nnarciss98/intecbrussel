package be.intecbrussel.sellers;

public class PriceList {
	
	private double ballPrice, rocketPrice, magnumStandardPrice;
	
	// DefaultConstructor
	public PriceList() {
		
	}
	
	// Constructor that sets the prices of the balls, rocket and magnumstandard ices
	public PriceList(double newBallPrice, double newRocketPrice, double newMagnumStandardPrice) {
		this.ballPrice = newBallPrice;
		this.rocketPrice = newRocketPrice;
		this.magnumStandardPrice = newMagnumStandardPrice;
	}
	
	public void setBallPrice(double newPrice) {
		this.ballPrice = newPrice;
	}
	
	public void setRocketPrice(double newPrice) {
		this.rocketPrice = newPrice;
	}
	
	public void setMagnumStandardPrice(double newPrice) {
		this.magnumStandardPrice = newPrice;
	}
	
	
	public double getBallPrice() {
		return this.ballPrice;
	}
	
	public double getRocketPrice() {
		return this.rocketPrice;
	}
	
	public double getMagnumStandardPrice() {
		return this.magnumStandardPrice;
	}
}
