package JAVA;

public class Interview
{
	
	static int n,i;
	static int a[]=new int[10];
	static int r;
	public static void main(String[] args)
	{
		n=Integer.parseInt(args[0]);
		r=Integer.parseInt(args[1]);
		for(i=2;i<(n+1);i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		if(search())
		{
			System.out.println("Candidate attended the interview");
		}
		else
		{
			System.out.println("Candidate not attended the interview");
		}
	}
	static boolean search()
	{
		int k=0;
		for(i=2;i<(n+1);i++)
		{
			if(a[i]==r)
		{
		k=1;
		break;
		}
		}
		if(k==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
