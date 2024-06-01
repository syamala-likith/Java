package Practise;

public class Student implements Comparable<Student> 
{
	int id;
	String gender,name,dept;
	public Student(int id,String gender,String name,String dept)
	{
		this.id=id;
		this.gender=gender;
		this.name=name;
		this.dept=dept;
	}
	@Override
	public int compareTo(Student s) 
	{
		if(id==s.id)
		{
			return 0;
		}
		else if(id>s.id)
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
		return ("ID:"+id+"\nName:"+name+"\nGender:"+gender+"\nDepartment:"+dept);
	}
}
