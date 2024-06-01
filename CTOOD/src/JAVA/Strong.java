package JAVA;

public class Strong 
{

	public static void main(String[] args)
	{
		int n=145;
		isStrong(n);

	}
	static void isStrong(int n)
	{
		int s=0,i;
		int n1=n;
		int a;
		while(n>0)
		{
			int f=1;
			a=n%10;
			for(i=a;i>0;i--)
			{
				f=f*i;
			}
			s=s+f;
			n=n/10;
		}
		if(checkStrong(s,n1))
			System.out.print("Is a strong number");
		else
			System.out.println("not");
	}
	static boolean checkStrong(int s,int n1)
	{
		if(s==n1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
