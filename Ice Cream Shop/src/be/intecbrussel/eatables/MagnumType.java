package be.intecbrussel.eatables;

public enum MagnumType {
	
	MILKCHOCOLATE(1.00),
	WHITECHOCOLATE(1.00),
	BLACKCHOCOLATE(1.00),
	ALPINENUTS(1.50),
	ROMANTICSTRAWBERRIES(1.00);

	
	private double price;
	
	MagnumType(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
}
