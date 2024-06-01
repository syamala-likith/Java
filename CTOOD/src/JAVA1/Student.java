package JAVA1;

public class Student
{
	long id;
	String branch,name;
	char gender;
	void setId(long id)
	{
		int n=0;
		long a=id;
		while(id>0)
		{
			n=n+1;
			id=id/10;
		}
		if(n==9)
		{
			this.id=a;
		}
		else
		{
			System.out.println("Enter the correct id number");
		}
	}
	void setName(String name)
	{
		int i,count=0;
		for(i=0;i<name.length();i++)
		{
			if( name.charAt(i) < 65 || name.charAt(i) > 90 && name.charAt(i)< 97 || name.charAt(i) > 122)
			{
				count=1;
			}
	    }
		if(count==0)
		{
			this.name=name;
		}
		else
		{
			System.out.println("enter correct name");
		}
	}
	void setGender(char gender)
	{
		if(gender=='M' || gender=='F')
		{
			this.gender=gender;
		}
		else
			System.out.println("Enter the correct gender");
	}
	void setBranch(String branch)
	{
		String a,b,c,d,e,f,g;
		a="CSE";
		b="ECE";
		c="ME";
		d="ECSE";
		e="EEE";
		f="BT";
		g="ME";
		if(branch.equals(a))
		{
			this.branch=branch;
		}
		else if(branch.equals(b))
		{
			this.branch=branch;
		}
		else if(branch.equals(c))
		{
			this.branch=branch;
		}
		else if(branch.equals(d))
		{
			this.branch=branch;
		}
		else if(branch.equals(e))
		{
			this.branch=branch;
		}
		else if(branch.equals(f))
		{
			this.branch=branch;
		}
		else if(branch.equals(g))
		{
			this.branch=branch;
		}
		else
		{
			System.out.println("Enter the correct branch");
		}
	}
	long getId()
	{
		return id;
	}
	String getName()
	{
		return name;
	}
	String getBranch()
	{
		return branch;
	}
	char getGender()
	{
		return gender;
	}
}
