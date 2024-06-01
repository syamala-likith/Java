package JAVA1;
import java.util.Scanner;
public class CuboidMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Cuboid c=new Cuboid();
		c.setLength(sc.nextDouble());
		c.setBreadth(sc.nextDouble());
		c.setHeight(sc.nextDouble());
		System.out.println(c.toString());
		sc.close();
	}

}
