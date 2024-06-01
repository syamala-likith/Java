package Week2Lab;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n ;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		if(isArmstrong(n))
				System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		displayArmstrong(n);
		sc.close();
	}
	static boolean isArmstrong(int n)
	{
		int r,sum=0,n1=n;
		while(n>0)
		 {
			 r=n%10;
			 sum=sum+(r*r*r);
			 n=n/10;
		 }
		 if(sum==n1)
			return true;
		 else
		   return false;
	
	}
	static void displayArmstrong(int n)
	{
		int i;
		for(i=1;i<=n;i++)
		{
			if(isArmstrong(i))
		    System.out.println(i);	
	    }

	}
}