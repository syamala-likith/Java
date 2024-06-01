package decoratory;

public class ChocolateCoffee extends AbstractCoffee
{
	public ChocolateCoffee(ICoffee sc)
	{
		super(sc);
	}
	private double getChocolateCoffePrice()
	{
		return 30*(1.15);
	}
	public double getPrice() 
	{
		return this.specialCoffee.getPrice()+getChocolateCoffePrice();
	}
}
