package HA1;
import java.util.Scanner;
import HOME1.StudentTotal2;
public class Student2
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id");
		StudentTotal2.id=sc.nextLong();
		System.out.println("Enter the marks of 3 subjects");
		StudentTotal2.a=sc.nextInt();
		StudentTotal2.b=sc.nextInt();
		StudentTotal2.c=sc.nextInt();
		System.out.println("ID:"+StudentTotal.id);
		System.out.println("Marks of 1st Subject:"+StudentTotal2.a);
		System.out.println("Marks of 2nd Subject:"+StudentTotal2.b);
		System.out.println("Marks of 3rd Subject:"+StudentTotal2.c);
		System.out.println("Total marks of the Student"+StudentTotal2.total());
		sc.close();
	}

}
