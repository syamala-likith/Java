package JAVA1;

public class GeometricShape1 
{
	String bordercolor;
	boolean filled;
	GeometricShape1(String bordercolor,boolean filled)
	{
		this.bordercolor=bordercolor;
		this.filled=filled;
	}
	double area()
	{
		return 0;
	}
	public String toString()
	{
		String s=String.format("Border Colour:%s\nFilled:%b",bordercolor,filled);
		return s;
	}
}