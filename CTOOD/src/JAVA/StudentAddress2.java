package JAVA;

public class StudentAddress2
{

	public static void main(String[] args)
	{
		Address2 Aobj=new Address2("Vijayawada","Andhra Pradesh","India");
		Student2 Sobj=new Student2("Likith",2100031023,"CSE",Aobj);
		Sobj.displayDetailes();
	}

}
