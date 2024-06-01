package Week5Lab;


import java.util.Scanner;

public class Department
{
	int i=0;
	Scanner sc=new Scanner(System.in);
	int count;
	Student s[]=new Student[100];
	void addNewStudent()
	{
		s[i]=new Student();
		System.out.println("Enter the 9 digits id number");
		s[i].setId(sc.nextLong());
		System.out.println("Eneter the branch in CSE,EEE,ME,BT,ECE,ECSE");
		s[i].setBranch(sc.next());
		System.out.println("Enter the gender either M or F");
		s[i].setGender(sc.next().charAt(0));
		System.out.println("Eneter the student name");
		s[i].setName(sc.next());
		i=i+1;
		count=i;
	}
	void printDetails()
	{
		for(int j=0;j<i;j++)
		{
			System.out.println(s[j].toString());
		}
	}
	boolean searchStudentId(long n)
	{
		int count=0;
		for(int j=0;j<i;j++)
		{
			if(s[j].id==n)
			{
				count=count+1;
				break;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean searchStudentName(String a)
	{
		int count=0;
		for(int j=0;j<i;j++)
		{
			if(s[j].name.equals(a))
			{
				count=count+1;
				break;
			}
		}
		if(count==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean modifyNameId(String b,long a)   //by Book Name
	{
		int j,count=0;
		for(j=0;j<i;j++)
		{
			if(s[j].id==a)
			{
				count=count+1;
				break;
			}
		}
		if(count==1)
		{
			s[j].name=b;
			return true;
		}
		else
		{
			return false;
		}
	}
}
