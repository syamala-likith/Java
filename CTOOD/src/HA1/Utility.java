package HA1;

public class Utility
{
	public static void main(String[] args) 
	{
		int a,b,c;
		int d[]=new int[5];
		a=1;
		b=2;
		c=3;
		d[0]=1;
		d[1]=2;
		d[2]=3;
		d[3]=4;
		d[4]=5;
		System.out.println(add(a,b));
		System.out.println(add(a,b,c));
		System.out.println(add(d));
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	static int add(int d[])
	{
		int i,sum=0;
		for(i=0;i<5;i++)
		{
			sum=sum+d[i];
		}
		
		return sum;
	}

}
