package SKILL;

import java.util.Scanner;

public class LibraryBook
{

	public static void main(String[] args)
	{
		boolean loop=true;
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		int choice;
		while(loop)
		{
			System.out.printf("1.Add new Book\n2.Print details of all Books\n3.Search a Book based on Book ID\n4.Search a Book based on Book name\n5.Modify Author name based on book name\n6.Exit\n");
			System.out.println("Enter Your Choice:");
			choice=sc.nextInt();
			switch(choice)
			{			
				case 1:
						l.addNewBook();
						break;
				case 2:
						l.printAllBook();
						break;
				case 3:
						System.out.println("Enter a ID to Search");
						l.searchBookId(sc.nextLong());
						break;
				case 4:
						System.out.println("Enter a Book Name to Search");
						sc.nextLine();
						l.searchBookName(sc.nextLine());
						break;
				case 5:
						System.out.println("Enter a Book Name to Search and Modify the Author Name");
						sc.nextLine();
						l.modifyBookAuthor(sc.nextLine());
						break;
				case 6:
						loop=false;
			}
		}
		sc.close();
	}
}
