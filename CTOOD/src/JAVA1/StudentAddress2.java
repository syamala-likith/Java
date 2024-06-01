package JAVA1;
public class StudentAddress2 
{
	public static void main(String[] args)
	{
		Student2 s=new Student2("Likith","CSE",2100031023,2003,18);
		s.setAddress2("Vijayawada","Andhra Pradesh","India");
		s.setAddress2("Vizag","Andhra Pradesh","India");
		s.setAddress2("Hyderabad","Tamilnadu","India");
		System.out.println(s.toString());
		
		for(Address2 obj: s.a)
		{
			System.out.println(obj);
		}
	}

}
