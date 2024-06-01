package PREPARATION;

import java.util.*;
public class AccountDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account Number and Balance");
		Account a=new Account(sc.nextInt(),sc.nextInt());
		try
		{
			System.out.println("Enter Amount For Withdrawl");
			a.withdrawl(sc.nextInt());
		}
		catch(InsufficentBalanceException e)
		{
			System.out.println(e);
		}
		System.out.println(a);
	}
}
