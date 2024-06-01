package Factory_Pattern;

import java.util.Scanner;
public class FactoryDemo 
{
	public static void main(String[] args) 
	{
		String className; 
		ShapeFactory sf=new ShapeFactory();
		Scanner sc=new Scanner(System.in);
		boolean loop=true;
		while(loop)
		{
			className=sc.next();
			Shape s=sf.getInstance(className); //circle
			if(s!=null)
			{
				s.findArea();
				s.findPerimeter();
			}
			else
				loop=false;
		}
	sc.close();
	}
}
