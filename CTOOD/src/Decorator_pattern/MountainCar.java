package Decorator_pattern;

public class MountainCar extends CarDecorator
{
	boolean suspension=false;
	String engineType="Diesel";
	String engineModel="BS5";
	String horsePower="1000CC";
	String gasType="normal";
	MountainCar(Car c)
	{
		super(c);
	}
	public void showCar()
	{
		System.out.println("Mountain car details are:");
		c.showCar();
		showMountainCar();
	}
	void showMountainCar()
	{
		System.out.println("suspension="+suspension);
		System.out.println("EngineType="+engineType);
		System.out.println("EngineModel="+engineModel);
		System.out.println("HorsePower="+horsePower);
		System.out.println("gastype="+gasType);
	}
}
