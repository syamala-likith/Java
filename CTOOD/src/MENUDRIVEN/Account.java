package MENUDRIVEN;

public class Account
{
	String name;
	long id,balance;
	static Account a=new Account();
	private Account()
	{
		
	}
	static Account sample()
	{
		return a;
	}
	void withdrawal(long money)
	{
		balance=balance-money;
		System.out.println("The Withdrawl Money is:"+money+" and Remaining Balance is:"+balance);
	}
	void deposit(long money)
	{
		balance=balance+money;
		System.out.println("Blance After the Money Diposite:"+balance);
	}
	public String toSting()
	{
		String s=String.format("Name:%s\nID:%d\nBalance:%d\n",name,id,balance);
		return s;
	}
}