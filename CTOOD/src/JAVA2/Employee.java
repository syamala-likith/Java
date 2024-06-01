package JAVA2;

public class Employee
{
	static String ename;
	static int eid;
	private int esalary;
	void setEsalary(int esalary)
	{
		this.esalary=esalary;
	}
	class Company
	{
		String cname;
		void display()                     //DISPLAY METHOD SHOULD BE NON STATIC
		{
			System.out.println("Employee Name:"+ename);
			System.out.println("Employee ID:"+eid);
			System.out.println("Employee Salary:"+esalary);
			System.out.println("Company Name:"+cname);
		}
	}

}
