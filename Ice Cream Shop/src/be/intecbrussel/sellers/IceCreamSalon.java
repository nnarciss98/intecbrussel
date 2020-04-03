package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
	
	private PriceList priceList;
	private double totalProfit = 0.00;
	
	public IceCreamSalon(PriceList newPriceList) {
		this.priceList = newPriceList;
	}
	
	
	public double getTotalProfit() {
		return this.totalProfit;
	}
	
	public void setProfit(double newProfit) {
		this.totalProfit = newProfit;
	}
	
	public PriceList getPriceList() {
		return this.priceList;
	}
	
	public Cone orderCone(Flavor[] flavor) {
		int numberOfBalls = flavor.length;
		this.setProfit(this.getTotalProfit() + numberOfBalls * this.getPriceList().getBallPrice());
		return new Cone(flavor);		
	}
	
	public IceRocket orderRocket() {
		this.setProfit(this.getTotalProfit() + this.getPriceList().getRocketPrice());
		return new IceRocket();
	}

	public Magnum orderMagnum(MagnumType type) {
		this.setProfit(type == null ? (this.getTotalProfit() + this.getPriceList().getMagnumStandardPrice()) : (this.getTotalProfit() + this.getPriceList().getMagnumStandardPrice() + type.getPrice()));
		return new Magnum(type);
	}
	
	public String toString() {
		return "Ice Cream Salon: \nPriceList: " + this.getPriceList() + "\nTotalProfit: " + this.getTotalProfit();
	}
}
