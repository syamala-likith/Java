package Exception_Handling;

import java.util.Scanner;
public class StudentDemo {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter student id and name");
		try
		{
			s.addStudent(sc.nextLong(), sc.next());
		}
		catch(IdNotValidException e)
		{
			System.out.println(e);
		}
		catch(NameNotValidException e)
		{
			System.out.println(e);
		}
	}
}
