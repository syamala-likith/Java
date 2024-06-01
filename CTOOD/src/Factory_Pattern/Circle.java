package Factory_Pattern;

public class Circle implements Shape
{
	double r=5;

	public void findArea() 
	{
		System.out.println("Circle Area="+Math.PI*r*r);
	}
	
	public void findPerimeter() {
		System.out.println("Circle Perimeter="+2*Math.PI*r);
	}
}
