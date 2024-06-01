package PREPARATION;

public class Account 
{
	private int an,b;
	Account(int an,int b)
	{
		this.an=an;
		this.b=b;
	}
	void withdrawl(int amt)throws InsufficentBalanceException
	{
		if(amt>b)
		{
			throw new InsufficentBalanceException("Low Balance");
		}
		else
		{
			b=b-amt;
		}
	}
	public String toString()
	{
		return ("Account Number:"+an+" Blanace:"+b);
	}
}
