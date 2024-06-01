package MENUDRIVEN;

public class Student 
{
	String name;
	long id;
	int tm;
	void addStudent(String name, long id, int tm)
	{
		this.name=name;
		this.id=id;
		this.tm=tm;
	}
	static boolean searchById(Student s[], int size, long n)
	{
		int i;
		for(i=0; i< size; i++)
		{
			if(s[i].id==n)
				return true;
		}
		return false;
	}
	static boolean searchByName(Student s[], int size, String name)
	{
		int i;
		for(i=0; i< size; i++)
		{
			if(s[i].name.equals(name))              //obj.a.equals(b);
				return true;
		}
		return false;
	}
	static void sortById(Student s[], int size)
	{
		Student temp;
		int i,j;
		for(i=0; i<size; i++)
		{
			for(j=0; j<size-i-1; j++)
			{
				if(s[j].id>s[j+1].id)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	static void sortByMarks(Student s[], int size)
	{
		Student temp;
		int i,j;
		for(i=0; i<size; i++)
		{
			for(j=0; j<size-i-1; j++)
			{
				if(s[j].tm>s[j+1].tm)
				{
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
	}
	static boolean updateNameById(Student s[], int size, long id, String name)
	{
		int i;
		for(i=0; i< size; i++)
		{
			if(s[i].id==id)
			{
				s[i].name=name;
				return true;
			}
		}
		return false;
	}
	public String toString()
	{
		String s=String.format("Name :%s ID :%d Total Marks :%d\n", name, id, tm);
		return s;
	}
}