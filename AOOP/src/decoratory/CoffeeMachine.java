package decoratory;

import java.util.Scanner;

public class CoffeeMachine 
{
	
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		ICoffee ic=new SimpleCoffee();
		while(true)
		{	
			int ch=menu();
			switch(ch)
			{
			case 1:
				ic=new CaremelCoffee(ic);
				break;
			case 2:
				ic=new ChocolateCoffee(ic);
				break;
			default:
				System.out.println("Thanks For Ordering Coffee at Cluster1 Cofee Shop");
				System.out.printf("Total Amount=%.2f%n",ic.getPrice());
				System.exit(0);
			}
		}
	}
	private static int menu()
	{
		System.out.println("1.Caremel Shot\n2.Chocolate Shot\n3.EXIT\nEnter Your Choice");
		return sc.nextInt();
	}

}
