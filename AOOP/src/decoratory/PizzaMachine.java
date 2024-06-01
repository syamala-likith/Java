package decoratory;

import java.util.Scanner;

public class PizzaMachine 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		double totalcost=0;
		IPizza ip=new simplePizza();
		while(true)
		{
			int ch=menu();
			switch(ch)
			{
			case 1:
				ip=new CheesePizza(ip);
				break;
			case 2:
				ip=new ChickenPizza(ip);
				break;
			default:
				System.out.printf("Total Price: %.2f",ip.getPrice());
				System.exit(0);
			}
		}
	}
	private static int menu()
	{
		System.out.println("1.Cheese Pizza\n2.Chicken Pizza\nAny Number To EXIT");
		return sc.nextInt();
	}

}
