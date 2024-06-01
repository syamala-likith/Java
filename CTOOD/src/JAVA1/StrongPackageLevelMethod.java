package JAVA1;

import JAVA2.StrongPackageLevelMethod1;

public class StrongPackageLevelMethod
{

		public static void isStrong(int n)
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
			if(StrongPackageLevelMethod1.checkStrong(s,n1))
				System.out.print("Is a strong number");
			else
				System.out.println("not");
		}

}
