package startage_pattern;

import java.util.Scanner;

public class Main_Method_For_Sort 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array to Sort");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		while(true)
		{
			System.out.println("1.Bubble Sort\n2.Insertion Sort\n3.Shell Sort\n4.Merge Sort\n5.Quick Sort\n6.To Change The ARRAY\n7.EXIT\nEnter Your Choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				Sorting_Interface_Main b=new Buble_Sort();
				b.sort(a);
				break;
			case 2:
				Sorting_Interface_Main i=new Insertion_Sort();
				i.sort(a);
				break;
			case 3:
				Sorting_Interface_Main s=new Shell_Sort();
				s.sort(a);
				break;
			case 4:
				Sorting_Interface_Main m=new Merge_Sort();
				m.sort(a);
				break;
			case 5:
				Sorting_Interface_Main q=new Quick_Sort();
				q.sort(a);
				break;
			case 6:
				System.out.println("Enetr the size of array");
				n=sc.nextInt();
				a=new int[n];
				System.out.println("Enter the array to Sort");
				for(int i1=0;i1<n;i1++)
				{
					a[i1]=sc.nextInt();
				}
				break;
			case 7:
				System.exit(0);
			}
		}
	}
}
