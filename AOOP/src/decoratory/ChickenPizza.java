package decoratory;

public class ChickenPizza extends AbstractPizza
{
	public ChickenPizza(IPizza p)
	{
		super(p);
	}
	private double getChickenPizzaPrice()
	{
		return 100*(1.25);
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.pizza.getPrice()+getChickenPizzaPrice();
	}
}
