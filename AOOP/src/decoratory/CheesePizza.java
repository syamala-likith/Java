package decoratory;

public class CheesePizza extends AbstractPizza
{
	public CheesePizza(IPizza p)
	{
		super(p);
	}
	private double getCheesePizzaPrice()
	{
		return 30*(1.15);
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.pizza.getPrice()+getCheesePizzaPrice();
	}
}
