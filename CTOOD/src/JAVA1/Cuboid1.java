package JAVA1;

public class Cuboid1
{
	private double l,b,h;
	boolean setDimensions(double l,double b,double h)
	{
		if(l>0 && b>0 && h>0)
		{
			this.l=l;
			this.b=b;
			this.h=h;
			return true;
		}
		else
			this.l=1;
			this.b=1;
			this.h=1;
			return false;
	}
	boolean setDimensions(double b)
	{
		if(b>0)
		{
			this.l=b;
			this.b=b;
			this.h=b;
			return true;
		}
		else
		{
			this.l=1;
			this.b=1;
			this.h=1;
			return false;
		}
	}
	String getVolume()
	{
		double v=l*b*h;
		return v+"";
	}
	public String toString()
	{
		String s=String.format("Volume is:%s",getVolume());
		return s;
	}
}
