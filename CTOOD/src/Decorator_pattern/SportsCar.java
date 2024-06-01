package Decorator_pattern;

public class SportsCar extends CarDecorator
{
	boolean suspension=true;
	String engineType="petrol";
	String engineModel="BS6";
	String horsePower="1800CC";
	String gasType="nitro";
	
	SportsCar(Car c) 
	{
		super(c);
	}
	public void showCar()
	{
		System.out.println("Sports car details are:");
		c.showCar();
		showSportsCar();
	}
	void showSportsCar()
	{
		System.out.println("suspension="+suspension);
		System.out.println("EngineType="+engineType);
		System.out.println("EngineModel="+engineModel);
		System.out.println("HorsePower="+horsePower);
		System.out.println("gastype="+gasType);
	}
}
