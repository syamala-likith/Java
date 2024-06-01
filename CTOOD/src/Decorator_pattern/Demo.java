package Decorator_pattern;

public class Demo 
{
	public static void main(String[] args) 
	{
		Car bc=new BasicCar();
		bc.showCar();
		
		Car sc=new SportsCar(new BasicCar());
		sc.showCar();
		
		Car mc=new MountainCar(new BasicCar());
		mc.showCar();
		
		
	}

}
