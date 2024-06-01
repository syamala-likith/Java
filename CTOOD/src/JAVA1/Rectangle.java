package JAVA1;

public class Rectangle extends GeometricShape
{
	double l,b;
	Rectangle(double l,double b)
	{
		super("red",true);
		setLength(l);
		setBreadth(b);
	}
	void setLength(double l)
	{
		this.l=l;
	}
	void setBreadth(double b)
	{
		this.b=b;
	}
	double getLength()
	{
		return l;
	}
	double getBreadth()
	{
		return b;
	}
	double area()
	{
		return l*b;
	}
	public String toString()
	{
		System.out.println(super.toString());
		String s=String.format("\nLength:%f\nBreadth:%f\nArea of Rectangle:%f\nArea of parent class:%f\n",getLength(),getBreadth(),area(),super.area());
		return s;
	}
}
