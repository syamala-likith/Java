package SKILL;

import java.util.Scanner;

public class BookMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Book a=new Book();
		Book b=new Book();
		System.out.println("Enter Book Name:");
		if(a.setName(sc.nextLine()))
		{
		}
		else
		{
			System.out.println("Enter correct name");
		}
		System.out.println("Enter Book ID:");
		if(a.setId(sc.nextLong()))
		{
		}
		else
		{
			System.out.println("Enter correct id");
		}
		System.out.println("Enter Author Name:");
		sc.nextLine();
		if(a.setAuthor(sc.nextLine()))
		{
		}
		else
		{
			System.out.println("Enter correct name");
		}
		System.out.println("Enter The Year Of Publication:");
		if(a.setYop(sc.nextInt()))
		{
		}
		else
		{
			System.out.println("Enter a correct Year");
		}
		
		
		
		System.out.println("Enter Book Name:");
		sc.nextLine();
		if(b.setName(sc.nextLine()))
		{
		}
		else
		{
			System.out.println("Enter correct name");
		}
		System.out.println("Enter Book ID:");
		if(b.setId(sc.nextLong()))
		{
		}
		else
		{
			System.out.println("Enter correct id");
		}
		System.out.println("Enter Author Name:");
		sc.nextLine();
		if(b.setAuthor(sc.nextLine()))
		{
		}
		else
		{
			System.out.println("Enter correct name");
		}
		System.out.println("Enter The Year Of Publication:");
		if(b.setYop(sc.nextInt()))
		{
		}
		else
		{
			System.out.println("Enter a correct Year");
		}
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}

}
