package JAVA1;

public class Student2 
{
	private String name,dept;
	private long id;
	private int year,age;
	Address2 a[]=new Address2[3];
	static int i=0;
	Student2(String name,String dept,long id,int year,int age)
	{
		this.name=name;
		this.dept=dept;
		this.id=id;
		this.year=year;
		this.age=age;
	}
	void setAddress2(String city,String state,String country)
	{
		Address2 Aobj=new Address2();
		Aobj.setCity(city);
		Aobj.setState(state);
		Aobj.setCountry(country);
		a[i++]=Aobj;
	}
	String getName()
	{
		return name;
	}
	String getDept()
	{
		return dept;
	}
	String getId()
	{
		return id+"";
	}
	String getYear()
	{
		return year+"";
	}
	String getAge()
	{
		return age+"";
	}
	public String toString()
	{
		String s=String.format("Name:%s\nDepartment:%s\nID:%s\nYear:%s\nAge:%s",getName(),getDept(),getId(),getYear(),getAge());
		return s;
	}
}
