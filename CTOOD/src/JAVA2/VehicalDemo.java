package JAVA2;

import java.util.Scanner;
import MENUDRIVEN.Vehical;
public class VehicalDemo
{
	public static void main(String[] args)
	{
		int i=0,j,choice,count=0;
		Scanner sc=new Scanner(System.in);
		Vehical v[]=new Vehical[8];
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.Add Data\n2.Display Data Basend On Vehical Number\n3.Exit");
			System.out.println("Enter the Choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Owner name,Enter Vehical Number,Vehical Wheeler,Mobile Number");
					sc.nextLine();
					v[i]=new Vehical(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextLong());
					i=i+1;
					break;
				case 2:
						System.out.println("Enter the Vehical Number To Display");
						sc.nextLine();
						String veh=sc.nextLine();
						for(j=0;j<i;j++)
						{
							if(v[j].vn.equals(veh))
							{
								count=1;
								break;
							}
							else
							{
								count=0;
							}
						}
						if(count==1)
						{
							System.out.println(v[j].toString());
						}
						else
						{
							System.out.println("Vehical Number Is Not Found");
						}
						break;
				case 3:
						System.exit(0);
			}
		}
		sc.close();
	}

}
