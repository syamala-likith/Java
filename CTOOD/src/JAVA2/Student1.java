package JAVA2;

public class Student1 
{
	static String name,dept;
	private static long id;
	Student1()
	{
		this("Alex");
		System.out.println("In no arguments constructor");
	}
	Student1(String name)
	{
		this(name,2100031023);
		System.out.println("In one argument constructor");
	}
	Student1(String name,long id)
	{
		this(name,id,"CSE");
		System.out.println("In two argument constructor");
	}
	Student1(String n,long i,String d)
	{
		name=n;
		id=i;
		dept=d;
	}
	//String getName()
	//{
		//return name;
	//}
	//String getDept()
	//{
		//return dept;
	//}
	//String getId()
	//{
		//return id+"";
	//}
	public String toString()
	{
		String s=String.format("Name:%s\nID:%s\nDepartment:%s",name,id,dept);
		return s;
	}
}
