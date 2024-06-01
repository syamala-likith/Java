package JAVA2;

public class StaticEmployee 
{
	static String ename="Likith";
	static int eid=31023;
	static private int esalary=200000;
	static void show()
	{
		System.out.println("Employee Name:"+ename);
		System.out.println("Employee ID:"+eid);
		System.out.println("Employee Salary:"+esalary);
	}
	static class Company
	{
		String cname;
		void display()                    
		{	
			System.out.println("Company Name:"+cname);
			show();
		}
	}
}
