package JAVA2;

import java.util.*;

public class ProductDemo {

	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		ArrayList<Product> p=new ArrayList<>();
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.Add Product Details\n2.Sort By Id\n3.Sort By Name\n4.Display\n5.EXIT\nEnter Your Choice:");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				p.add(new Product(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat()));
			}
		}
	}

}
