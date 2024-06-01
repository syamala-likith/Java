package JAVA1;

public class Cuboid 
{
	private double length,breadth,height;
	boolean setLength(double length)
	{
		if(length>0)
		{
			this.length=length;
			return true;
		}
		else
			return false;
	}
	boolean setBreadth(double breadth)
	{
		if(breadth>0)
		{
			this.breadth=breadth;
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean setHeight(double height)
	{
		if(height>0)
		{
			this.height=height;
			return true;
		}
		else
		{
			return false;
		}
	}
	String getLength()
	{
		return length+"m";
	}
	String getBreadth()
	{
		return breadth+"m";
	}
	String getHeight()
	{
		return height+"m";
	}
	String findVolume()
	{
		return length*breadth*height+"cu.m";
	}
	public String toString()
	{
		String s=String.format("Lenght :%s\nBreadth :%s\nHeight :%s\nvolume :%s\n",getLength(),getBreadth(),getHeight(),findVolume());
		return s;
	}
}
