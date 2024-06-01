package SKILL;

public class Book 
{
	String name,author;
	long id;
	int yop;
	boolean setName(String name)
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
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean setId(long id)
	{
		if(id>0)
		{
			this.id=id;
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean setAuthor(String author)
	{
		int i,count=0;
		for(i=0;i<author.length();i++)
		{
			if( author.charAt(i) < 65 || author.charAt(i) > 90 && author.charAt(i)< 97 || author.charAt(i) > 122)
			{
				count=1;
			}
	    }
		if(count==0)
		{
			this.author=author;
			return true;
		}
		else
		{
			return false;
		}
	}
	boolean setYop(int yop)
	{
		int i=0;
		int n=yop;
		while(n>0)
		{
			i=i+1;
			n=n/10;
		}
		if(i==4)
		{
			this.yop=yop;
			return true;
		}
		else
		{
			return false;
		}
	}
	String getName()
	{
		return name;
	}
	String getAuthor()
	{
		return author;
	}
	long getId()
	{
		return id;
	}
	int getYop()
	{
		return yop;
	}
	public String toString()
	{
		String s=String.format("Book Name:%s\nBook Author:%s\nBook ID:%d\nYear Of Publication:%d\n",getName(),getAuthor(),getId(),getYop());
		return s;
	}
}
