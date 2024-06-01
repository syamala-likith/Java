package SKILL;

import java.util.Scanner;

public class Library
{
	int i=0;
	Scanner sc=new Scanner(System.in);
	int count;
	Book b[]=new Book[100];
	void addNewBook()
	{
		b[i]=new Book();
		System.out.println("Enter Book name:");
		b[i].setName(sc.next());
		System.out.println("Enter Book Author Name:");
		sc.nextLine();
		b[i].setAuthor(sc.nextLine());
		System.out.println("Enter Book ID:");
		b[i].setId(sc.nextLong());
		System.out.println("Enter Year Of Publication");
		b[i].setYop(sc.nextInt());
		i=i+1;
		count=i;
	}
	void printAllBook()
	{
		for(int j=0;j<i;j++) 
		{
			System.out.println(b[j].toString());
		}
	}
	void searchBookId(long n)
	{
		int count=0;
		for(int j=0;j<i;j++)
		{
			if(b[j].id==n)
			{
				count=count+1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("The Book id Found");
		}
		else
		{
			System.out.println("The Book id Not Found");
		}
	}
	void searchBookName(String a)
	{
		int count=0;
		for(int j=0;j<i;j++)
		{
			if(b[j].name.equals(a))
			{
				count=count+1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("The Book id Found");
		}
		else
		{
			System.out.println("The Book id Not Found");
		}
	}
	void modifyBookAuthor(String a)   //by Book Name
	{
		int j,count=0;
		for(j=0;j<i;j++)
		{
			if(b[j].name.equals(a))
			{
				count=count+1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("The Book id Found");
			System.out.println("Modify the Author Name:");
			sc.nextLine();
			b[j].author=sc.nextLine();
		}
		else
		{
			System.out.println("The Book id Not Found");
		}
	}
}
