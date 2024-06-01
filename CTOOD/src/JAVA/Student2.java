package JAVA;

public class Student2 
{
	String name,dept;
	long id;
	Address2 a;
	Student2(String name,long id,String dept,Address2 a)
	{
		this.name=name;
		this.dept=dept;
		this.id=id;
		this.a=a;
	}
	void displayDetailes()
	{
		System.out.println("Name:"+name);
		System.out.println("ID:"+id);
		System.out.println("Department:"+dept);
		System.out.println("Country:"+a.country);
		System.out.println("City:"+a.city);
		System.out.println("State:"+a.state);
	}
}
