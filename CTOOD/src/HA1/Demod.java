package HA1;
import Exam.Dictionary;
import java.util.Scanner;
public class Demod 
{
	public static void main(String args[])
	{
		int i=0,j,ch;
		Scanner sc=new Scanner(System.in);
		Dictionary d[]=new Dictionary[5];
		boolean loop=true;
		while(loop)
		{
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				d[i]=new Dictionary(sc.nextLine(),sc.nextLong());
				i=i+1;
				break;
			case 2:
				for(j=0;j<i;j++)
				{
					System.out.println(d[i]);
				}
			}
		}
			
	}
}
