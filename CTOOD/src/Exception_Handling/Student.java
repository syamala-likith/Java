package Exception_Handling;

public class Student 
{
	long id;
	String name;
	
	void addStudent(long id, String name) throws IdNotValidException, NameNotValidException
	{
		int i,c,flag=1;
		c=(int)Math.log10(id)+1;
		if(c!=10)
			throw new IdNotValidException("Invalid Id");
		else
			this.id=id;
		
		for(i=0; i<name.length();i++)
		{
			if(name.charAt(i)>='a' && name.charAt(i)<='z')
				continue;
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==0)
			throw new NameNotValidException("Invalid Name");
		else
			this.name=name;
	}
}
