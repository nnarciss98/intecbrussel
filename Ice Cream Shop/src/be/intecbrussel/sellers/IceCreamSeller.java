package be.intecbrussel.sellers;

import be.intecbrussel.eatables.*;

public interface IceCreamSeller extends Profitable{
	
	public Cone orderCone(Flavor[] flavor);
	
	public IceRocket orderRocket();
	
	public Magnum orderMagnum(MagnumType type);

}
