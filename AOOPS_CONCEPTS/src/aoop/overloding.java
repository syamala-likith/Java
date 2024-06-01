package aoop;

public class overloding
{

	public static void main(String[] args) 
	{
		sum(10,12);
		sum(1,2,3);
		sum(1.5,2);
	}
	static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	static void sum(double a,int b)
	{
		System.out.println(a+b);
	}

}
