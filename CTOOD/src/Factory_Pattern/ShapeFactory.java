package Factory_Pattern;
 
public class ShapeFactory 
{
	Shape getInstance(String obj)
	{
		if(obj.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(obj.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(obj.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}
}
