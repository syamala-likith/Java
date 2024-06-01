package JAVA1;

public class Circle extends GeometricShape
{
	double r;
	Circle(double r)
	{
		super("Black",true);
		this.r=r;
		//setRadius(r);
	}
	/*void setRadius(double r)
	{
		this.r=r;
	}*/
	double getRadius()
	{
		return r;
	}
	double area()
	{
		return Math.PI*r*r;
	}
	public String toString()
	{
		System.out.println(super.toString());
		String s=String.format("\nRadius:%f\nArea of Circle:%f\nArea of parent class:%f",getRadius(),area(),super.area());
		return s;
	}
}
