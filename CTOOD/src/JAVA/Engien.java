package JAVA;

public class Engien 
{
	String type;
	int cc,chesse;
	Engien(String type,int cc,int chesse)
	{
		this.type=type;
		this.cc=cc;
		this.chesse=chesse;
	}
	public String toString()
	{
		String s=String.format("\nEngien type:%s\nEngien CC:%d\nEngien Chesse Number:%d",type,cc,chesse);
		return s;
	}
}
