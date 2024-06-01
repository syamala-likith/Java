package JAVA1;
import java.util.Scanner;
public class Cuboid1Main 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Cuboid1 c=new Cuboid1();
		Cuboid1 d=new Cuboid1();
		c.setDimensions(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		d.setDimensions(sc.nextDouble());
		System.out.println(c.toString());
		System.out.println(d.toString());
		sc.close();
	}

}
