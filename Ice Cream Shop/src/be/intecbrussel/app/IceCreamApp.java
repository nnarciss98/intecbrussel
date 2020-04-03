package be.intecbrussel.app;

import be.intecbrussel.sellers.*;
import be.intecbrussel.eatables.*;

public class IceCreamApp {

	public static void main(String[] args) {
		
		PriceList priceList = new PriceList(1.00, 1.00, 1.50);
		IceCreamSeller seller = new IceCreamSalon(priceList);
		
		Flavor[] flavors = {Flavor.BANANA, Flavor.CHOCOLATE};
		Eatable iceCream1 = seller.orderRocket();
		Eatable iceCream2 = seller.orderMagnum(null);
		Eatable iceCream3 = seller.orderCone(flavors);
		
		Eatable[] orderedIces = {iceCream1, iceCream2, iceCream3};
		
		for (int i = 0; i < orderedIces.length; i++) {
			orderedIces[i].eat();
		}
		
		System.out.println("The profit is: " + seller.getTotalProfit());
	}

}
