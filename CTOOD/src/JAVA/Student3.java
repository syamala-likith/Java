package JAVA;

public class Student3
{
	String name,dept;
	long id;
	Address3 a;
	Student3(String name,String dept,long id,Address3 a)
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
		System.out.println();
	}
}
