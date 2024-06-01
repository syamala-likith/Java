package JAVA;

import java.util.Scanner;

public class PowerOfNumber 
{

	public static void main(String[] args)
	{
		 double base,ex;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the base value:");
		 base=sc.nextDouble();
		 System.out.println("Enter exponent value:");
		 ex=sc.nextDouble();
		 power(base,ex);
		 sc.close();
	}
	static void power(double base,double ex)
	{
		double a=1;
		boolean loop=true;
		while(loop)
		{
			if(base>0 && ex>0)
			{
				a=a*base;
			}
			else
			{
				loop=false;
			}
			ex=ex-1;
		}
		System.out.print(a);
	}
}
