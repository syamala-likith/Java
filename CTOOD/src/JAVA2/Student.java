package JAVA2;

public class Student 
{
	static String name,dept;
	static long id;
	public static void main(String args[])
	{
		new Student();
		displayDetails();
	}
	Student()
	{
		this("Alex");
		System.out.println("In no arguments constructor");
	}
	Student(String name)
	{
		this(name,2100031023);
		System.out.println("In one argument constructor");
	}
	Student(String name,long id)
	{
		this(name,id,"CSE");
		System.out.println("In two argument constructor");
	}
	Student(String n,long i,String d)
	{
		name=n;
		id=i;
		dept=d;
	}
	static void displayDetails()
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(dept);
	}
	
}
