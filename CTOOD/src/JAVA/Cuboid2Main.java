package JAVA;
import java.util.Scanner;
public class Cuboid2Main 
{

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) 
		{
			int n,i;
			System.out.println("Enter the size of Object array");
			n=s.nextInt();
			Cuboid2 c[]=new Cuboid2[n];
			Cuboid2 d[]=new Cuboid2[n];
			for(i=0;i<n;i++)
			{
				c[i]=new Cuboid2();
				d[i]=new Cuboid2();
				System.out.println("Enter the values");
				c[i].setDimensions(s.nextDouble(),s.nextDouble(),s.nextDouble());
				d[i].setDimensions(s.nextDouble());
			}
			for(i=0;i<n;i++)
			{
				System.out.println(c[i]);
				System.out.println(d[i]);
			}
			s.close();
		}
	}
}
