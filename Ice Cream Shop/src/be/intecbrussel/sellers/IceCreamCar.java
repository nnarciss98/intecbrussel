package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;
public class IceCreamCar {

	private PriceList priceList;
	private Stock stock;
	private double profit;
	
	public IceCreamCar() {
		
	}
	
	public IceCreamCar(PriceList priceList, Stock stock) {
		this.priceList = priceList;
		this.stock = stock;
	}
	
	public Stock getStock() {
		return this.stock;
	}
	
	public void setStock(Stock newStock) {
		this.stock = newStock;
	}
	
	public double getProfit() {
		return this.profit;
	}
	
	public void setProfit(double newProfit) {
		this.profit = newProfit;
	}
	
	public PriceList getPriceList() {
		return this.priceList;
	}
	
	public Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException {
		try {
			this.getStock().setCones(this.getStock().getCones() -1);
			if(this.getStock().getCones() < 1) {
				throw new NoMoreIceCreamException();
			}
			this.setProfit(this.getProfit() + flavor.length * this.getPriceList().getBallPrice());
			return this.prepareCone(flavor);
		}
		catch(NoMoreIceCreamException e){
			System.out.println("Sorry, but we don't have any more Ice Cream Cones... Maybe nex time kid :) ");
		}
		return null;
	}
	
	public Cone prepareCone(Flavor[] flavor) {
		return new Cone();
	}
	
	public IceRocket orderIceRocket() throws NoMoreIceCreamException {
		try {
			this.getStock().setIceRockets(this.getStock().getIceRockets() -1);
			if(this.getStock().getIceRockets() < 1) {
				throw new NoMoreIceCreamException();
			}
			this.setProfit(this.getProfit() + this.getPriceList().getRocketPrice());
			return this.prepareIceRocket();
		}
		catch(NoMoreIceCreamException e){
			System.out.println("Sorry, but we don't have any more Ice Rockets... Maybe nex time kid :) ");
		}
		return null;
	}
	
	public IceRocket prepareIceRocket() {
		return new IceRocket();
	}
	
	public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
		try {
			this.getStock().setMagni(this.getStock().getMagni() -1);
			if(this.getStock().getMagni() < 1) {
				throw new NoMoreIceCreamException();
			}
			this.setProfit(this.getProfit() + (type == null ? this.getPriceList().getMagnumStandardPrice() : this.getPriceList().getMagnumStandardPrice() + type.getPrice()));
			return this.prepareMagnum(type);
		}
		catch(NoMoreIceCreamException e){
			System.out.println("Sorry, but we don't have any more Magnum Ice Cream... Maybe nex time kid :) ");
		}
		return null;
	}
	
	public Magnum prepareMagnum(MagnumType type) {
		return new Magnum(type);
	}
	
}
