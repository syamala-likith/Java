package PREPARATION;

public class Country 
{
	private String n,c;
	private int p;
	public void setNCP(String n,String c,int p)
	{
		this.n=n;
		this.c=c;
		this.p=p;
	}
	public String toString()
	{
		return ("Name:"+n+" Continent:"+c+" Population:"+p);
	}
}
