package factory;

public class ShapeFactory 
{
	public Shape getIntance(String s)
	{
		if(s.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if(s.equalsIgnoreCase("rectangle"))
		{
			return new Rectangle();
		}
		else if(s.equalsIgnoreCase("square"))
		{
			return new Square();
		}
		else
		{
			return null;
		}
	}
}
