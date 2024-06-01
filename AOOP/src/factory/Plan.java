package factory;

public abstract class Plan
{
	protected double rate;
	abstract void getRate();
	public void calculateBill(int u)
	{
		System.out.println(u*rate);
	}
}
