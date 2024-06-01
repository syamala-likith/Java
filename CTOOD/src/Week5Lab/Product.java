package Week5Lab;

public class Product 
{
	private String name;
	private long id;
	private int q,pr;
	Product()
	{
	}
	Product(String name,long id,int q,int pr)
	{
		this.name=name;
		this.id=id;
		setQ(q);
		setPr(pr);
	}
	Product(Product a)
	{
		this.name=a.name;
		this.id=a.id;
		this.q=a.q;
		this.pr=a.pr;
	}
	boolean setQ(int q)
	{
		if(q>0)
		{
			this.q=q;
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean setPr(int pr)
	{
		if(pr>0)
		{
			this.pr=pr;
			return true;
		}
		else
		{
			return false;
		}
	}
	int getQ()
	{
		return q;
	}
	int getPr()
	{
		return pr;
	}
	public String toString()
	{
		String s=String.format("Name:%s\nID:%d\nQuantity:%d\nPrice:%d\nTotal Amount:%d",name,id,getQ(),getPr(),getQ()*getPr());
		return s;
	}
}
