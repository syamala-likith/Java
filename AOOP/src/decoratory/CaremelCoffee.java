package decoratory;

public class CaremelCoffee extends AbstractCoffee
{
	public CaremelCoffee(ICoffee sc)
	{
		super(sc);
	}
	private double getCaremelCoffeePrice()
	{
		return 20*(1.18);
	}
	public double getPrice() 
	{
		return this.specialCoffee.getPrice()+getCaremelCoffeePrice();
	}
}
