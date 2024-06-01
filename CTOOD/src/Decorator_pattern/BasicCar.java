package Decorator_pattern;

public class BasicCar implements Car
{
	@Override
	public void showCar() 
	{
		System.out.println("Brand="+brand);
		System.out.println("Model="+model);
		System.out.println("Cost="+cost);
	}

}
