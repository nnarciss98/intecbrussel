package be.intecbrussel.app;

import be.intecbrussel.sellers.*;
import be.intecbrussel.eatables.*;

public class IceCreamAppv2 {

	public static void main(String[] args) throws NoMoreIceCreamException {
		
		PriceList priceList = new PriceList(1.00, 1.00, 1.50);
		Stock stock = new Stock(1,3,2,2);
		IceCreamCar seller = new IceCreamCar(priceList, stock);
		
		Flavor[] flavors = {Flavor.BANANA, Flavor.CHOCOLATE};
		Eatable iceCream1 = seller.orderIceRocket();
		Eatable iceCream2 = seller.orderMagnum(null);
		Eatable iceCream3 = seller.orderCone(flavors);
		
		Eatable[] orderedIces = {iceCream1, iceCream2, iceCream3};
		
		for (int i = 0; i < orderedIces.length; i++) {
			orderedIces[i].eat();
		}
		
		System.out.println("The profit is: " + seller.getProfit());
	}

}
