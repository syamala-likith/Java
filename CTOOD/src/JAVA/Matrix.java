package JAVA;
import java.util.Scanner;
public class Matrix 
{
	static int i,j;
	static int a[][]=new int[10][10];
	static int n;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		print();
		diagonalPrint();
		findSum();
		principleSum();
	}
	static void print()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void diagonalPrint()
	{
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(a[i][j]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	static void findSum()
	{
		int s=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				s=s+a[i][j];
			}
		}
		System.out.println(s);
		System.out.println();
	}
	static void principleSum()
	{
		int s=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==j)
				{
					s=s+a[i][j];
				}
			}
		}
		System.out.println(s);
	}
}
