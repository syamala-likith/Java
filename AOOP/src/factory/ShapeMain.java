package factory;

import java.util.Scanner;

public class ShapeMain 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ShapeFactory sf=new ShapeFactory();
		while(true)
		{
			System.out.print("1.Rectangle\n2.Circle\n3.Square\nEnter Your Choice To Find Shape: ");
			Shape s=sf.getIntance(sc.next());
			if(s!=null)
			{
				s.draw();
			}
			else 
			{
				System.exit(0);
			}
		}
	}

}
