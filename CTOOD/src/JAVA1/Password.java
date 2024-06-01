package JAVA1;

public class Password 
{
	static String a;
	static void enterP(String p)
	{
		int i,c1=0,c2=0;
		if(p.length()<=8)
		{
			for(i=0;i<p.length();i++)
			{
				if((p.charAt(i) >=65 && p.charAt(i) <=90) || (p.charAt(i)>= 97 && p.charAt(i) <=122))
				{
					c1++;
				}
				if((p.charAt(i)>=48 && p.charAt(i)<=57))
				{
					c2++;
				}
			}
		}
		else
		{
			System.out.println("Invalid Password");
		}
		if(c1>0 && c2>0)
		{
			a=p;
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("Invalid Password");
		}
	}
}
