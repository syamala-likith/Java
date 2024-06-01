package PREPARATION;
import java.util.*;
public class Password 
{

	public static void main(String[] args) 
	{
		int i,ch,c=0,c2=0;
		long l;
		String s;
		while(true)
		{
			System.out.println("1.Number\n2.Word\nEnetr Your Choice");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Number");
				l=sc.nextLong();
				long l1=l;
				while(l1>0)
				{
					c=c+1;
					l1=l1/10;
				}
				if(c==10)
				{
					
					System.out.println("Valid Number");
					c=0;
				}
				else
				{
					System.out.println("Invalid Number");
					c=0;
				}
				break;
			case 2:
				System.out.println("Enter Word");
				sc.nextLine();
				s=sc.nextLine();
				for(i=0;i<s.length();i++)
				{
					if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)==' '))
					{
						c2=c2+1;		
					}
				}
				if(c2==s.length())
				{
					System.out.println("Valid Password");
					c2=0;
				}
				else
				{
					System.out.println("Invalid Password");
					c2=0;
				}
				break;
				default :
					System.exit(0);
			}
		}
	}

}
