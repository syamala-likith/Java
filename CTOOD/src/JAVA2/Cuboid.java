package JAVA2;

public class Cuboid 
{
	double l,b,h;
	public static void main(String[] args) 
	{
		Cuboid x=new Cuboid();
		Cuboid y=new Cuboid();
		x.l=Double.parseDouble(args[0]);
		x.b=Double.parseDouble(args[1]);
		x.h=Double.parseDouble(args[2]);
		y.l=Double.parseDouble(args[3]);
		y.b=Double.parseDouble(args[4]);
		y.h=Double.parseDouble(args[5]);
		x.findVolume();
		y.findVolume();
	}
	void findVolume()
	{
		System.out.println(l*b*h);
	}
}
