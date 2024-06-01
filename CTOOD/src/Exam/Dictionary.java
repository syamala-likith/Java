package Exam;

public class Dictionary {

	public String name;
	public long m;
	public Dictionary(String name,long m)
	{
		this.name=name;
		this.m=m;
	}
	public String toString()
	{
		String s=String.format("Name:%s\nMobile:%d",name,m);
		return s;
	}
}
