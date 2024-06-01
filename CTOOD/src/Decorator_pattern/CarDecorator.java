package Decorator_pattern;

public class CarDecorator implements Car
{
	Car c;
	CarDecorator(Car c)
	{
		this.c=c;
	}
	
	@Override
	public void showCar() 
	{
		c.showCar();
	}
	
}
