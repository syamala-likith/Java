package MENUDRIVEN;

import java.util.Scanner;

public class AccountMain 
{
	
	public static void main(String[] args)
	{
		int a;
		long money;
		boolean loop=true;
		Scanner sc=new Scanner(System.in);
		Account n=Account.sample();
		System.out.println("Enter the Bank Holder name:");
		n.name=sc.nextLine();
		System.out.println("Enter the Bank Holder id:");
		n.id=sc.nextLong();
		System.out.println("The initial balance is:500");
		n.balance=500;
		while(loop)
		{
			System.out.println("1.Deposite\n2.Withdrawl\n3.Display\nEnter The Choice:");
			a=sc.nextInt();
			switch(a)
			{
				case 1:
						System.out.println("Enter Money To Deposite:");
						n.deposit(sc.nextLong());
						break;
				case 2:
						while(true)
						{
							System.out.println("Enter Money TO Withdrawl");
							money=sc.nextLong();
							if(n.balance>=money)
							{
								n.withdrawal(money);
								break;
							}
							else if(n.balance==0)
							{
								System.out.println("Bank balance is Empty  You need to Deposite some money");
								break;
							}
							else
							{
								System.out.println("Your Balance is low You can't take that Amount of money");
								System.out.println("You can Withdral Upto:"+n.balance+"Rs");
							}
						}
						break;
				case 3:
						System.out.println(n.toSting());
						break;
				default:
						loop=false;
			}			
		}
		sc.close();
	}

}