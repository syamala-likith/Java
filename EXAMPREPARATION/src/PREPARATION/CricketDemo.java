package PREPARATION;

import java.util.*;

public class CricketDemo
{

	public static void main(String[] args) 
	{
		int i=0,ch;
		String s;
		Scanner sc=new Scanner(System.in);
		CricketPlayer c[]=new CricketPlayer[100];
		while(true)
		{
			System.out.println("1.Add new Player\n2.Display\n3.Display only Players of a given Country\nEter Your Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				c[i]= new CricketPlayer();
				c[i++].setNameCountryNomberofplayers(sc.next(), sc.next(), sc.nextInt());
				break;
			case 2:
				for(int j=0;j<i;j++)
				{
					System.out.println(c[j]);
				}
				break;
			case 3:
				System.out.println("Enter Country To Display");
				s=sc.next();
				for(int j=0;j<i;j++)
				{
					if(c[j].getCountry().equals(s))
					{
						System.out.println(c[j]);
					}
				}
				break;
				default:
					System.exit(0);;
			}
		}
	}

}
