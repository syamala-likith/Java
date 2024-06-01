package HA1;

public class Utility1 
{
    static int n;
	public static void main(String[] args) 
	{
		int a,b,c,i,j;
		n=Integer.parseInt(args[0]);
		int d[]=new int[n];
		a=Integer.parseInt(args[1]);
		b=Integer.parseInt(args[2]);
		c=Integer.parseInt(args[3]);
		for(i=0,j=4;i<n;i++,j++)
		{
			d[i]=Integer.parseInt(args[j]);
		}
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
		for(i=0;i<n;i++)
		{
			sum=sum+d[i];
		}
		
		return sum;
	}

}
