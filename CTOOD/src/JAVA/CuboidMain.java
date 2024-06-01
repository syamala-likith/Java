package JAVA;
import java.util.Scanner;
public class CuboidMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Cuboid c=new Cuboid();
		Cuboid d=new Cuboid();
		c.setDimensions(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		d.setDimensions(sc.nextDouble());
		c.volume();
		d.volume();
		sc.close();
	}

}
