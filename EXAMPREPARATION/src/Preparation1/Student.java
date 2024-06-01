package Preparation1;

public class Student implements Comparable<Student>
{
	long id;
	String name;
	double weight,height;
	int age;
	Student(String name,long id,double weight,double height,int age)
	{
		this.name=name;
		this.id=id;
		this.weight=weight;
		this.height=height;
		this.age=age;
	}
	public int compareTo(Student s)
	{
		if(s.height==height)
		{
			return 0;
		}
		else if(height>s.height)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public String toString()
	{
		return ("Name:"+name+" Id:"+id+" Weight:"+weight+" Height:"+height+" Age:"+age);
	}
}
