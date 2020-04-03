package be.intecbrussel.sellers;

public class Stock {
	
	private int iceRockets, cones, balls, magni;
	
	
	public Stock(int iceRockets, int cones, int balls, int magni) {
		this.iceRockets = iceRockets;
		this.cones = cones;
		this.balls = balls;
		this.magni = magni;
	}
	
	public int getIceRockets() {
		return this.iceRockets;
	}
	
	public void setIceRockets(int newNumber) {
		this.iceRockets = newNumber;
	}
	
	public int getCones() {
		return this.cones;
	}
	
	public void setCones(int newNumber) {
		this.cones = newNumber;
	}
	
	public int getBalls() {
		return this.balls;
	}
	
	public void setBalals(int newNumber) {
		this.balls = newNumber;
	}

	public int getMagni() {
		return this.magni;
	}
	
	public void setMagni(int newNumber) {
		this.magni = newNumber;
	}
}
