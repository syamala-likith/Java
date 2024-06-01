package PREPARATION;

public class Car1 
{
	private String n,m;
	void setNM(String n,String m)
	{
		this.n=n;
		this.m=m;
	}
	String getN()
	{
		return n;
	}
	String getM()
	{
		return m;
	}
	public String toString()
	{
		return ("Name:"+n+" Manfacturer:"+m+"\n");
	}
}
