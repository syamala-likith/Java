package Exam;

public class Utility 
{
	public static int findSmallest(int a,int b)
	{
		if(a>b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int findSmallest(int a,int b,int c)
	{
		if(a<b && a<c)
		{
			return a;
		}
		else if(b<c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static int findSmallest(int a[])
	{
		int i,min=a[0];
		for(i=0;i<5;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	
}
