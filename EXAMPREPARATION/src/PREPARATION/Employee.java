package PREPARATION;

public class Employee 
{
	long id;
	public String name,gender;
	float salary;
	Employee(String name,String gender,long id,float salary)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	public String toString()
	{
		return ("Name:"+name+" ID:"+id+" Gender:"+gender+" Salary:"+salary);
	}
}
