package JAVA2;

public class EmployeeCompany 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		Employee.Company c=e.new Company();
		Employee.ename="Likith";
		Employee.eid=31023;
		e.setEsalary(2000000);
		c.cname="Chrome";
		c.display();
		
	}

}
