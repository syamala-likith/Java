package aoop;

import java.util.Scanner;

public class calc 
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	void div(int a,int b)
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) 
	{
		int ch;
		calc c=new calc();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.EXIT\nEnter Your Choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Two Numbers");
				c.add(sc.nextInt(), sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Two Numbers");
				c.sub(sc.nextInt(), sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Two Numbers");
				c.mul(sc.nextInt(), sc.nextInt());
				break;
			case 4:
				System.out.println("Enter Two Numbers");
				c.div(sc.nextInt(), sc.nextInt());
				break;
			case 5:
				System.exit(0);
			}
		}
		
	}

}
