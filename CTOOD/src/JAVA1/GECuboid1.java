package JAVA1;

public class GECuboid1 extends GERectangle1
{
	double h;
	public GECuboid1(double h)
	{
		super(10,20);
		setHeight(h);
	}
	void setHeight(double h)
	{
		this.h=h;
	}
	double getHeigth()
	{
		return h;
	}
	double volume()
	{
		return l*b*h;
	}
	public String toString()
	{
		System.out.println(super.toString());
		String s=String.format("Heigth:%f\nVolume of Cuboid:%f",getHeigth(),volume());
		return s;
	}
}