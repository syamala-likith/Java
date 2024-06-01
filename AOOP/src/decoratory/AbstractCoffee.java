package decoratory;

public abstract class AbstractCoffee implements ICoffee
{
	protected ICoffee specialCoffee;
	public AbstractCoffee(ICoffee sc)
	{
		this.specialCoffee=sc;
	}

}