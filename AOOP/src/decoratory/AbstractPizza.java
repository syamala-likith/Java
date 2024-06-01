package decoratory;

public abstract class AbstractPizza implements IPizza
{
	protected IPizza pizza;
	public AbstractPizza(IPizza p)
	{
		this.pizza=p;
	}
}
