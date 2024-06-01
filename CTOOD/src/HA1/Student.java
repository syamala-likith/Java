package HA1;
import java.util.Scanner;
public class Student 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id");
		StudentTotal.id=sc.nextLong();
		System.out.println("Enter the marks of 3 subjects");
		StudentTotal.a=sc.nextInt();
		StudentTotal.b=sc.nextInt();
		StudentTotal.c=sc.nextInt();
		System.out.println("ID:"+StudentTotal.id);
		System.out.println("Marks of 1st Subject:"+StudentTotal.a);
		System.out.println("Marks of 2nd Subject:"+StudentTotal.b);
		System.out.println("Marks of 3rd Subject:"+StudentTotal.c);
		System.out.println("Total marks of the Student"+StudentTotal.total());
		sc.close();
	}

}
