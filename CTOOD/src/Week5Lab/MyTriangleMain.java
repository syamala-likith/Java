package Week5Lab;

import java.util.Scanner;

public class MyTriangleMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		MyTriangle t=new MyTriangle();
		System.out.println("Enter The value of Side 1:");
		t.setS1(sc.nextInt());
		System.out.println("Enter the value of side 2:");
		t.setS2(sc.nextInt());
		System.out.println("Enter the value of side 3:");
		t.setS3(sc.nextInt());
		if(t.isValid())
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
		if(t.area()>0)
		{
			System.out.println("Area is:"+t.area());
		}
		else
		{
			System.out.println("Invalid");
		}
		sc.close();
	}

}
