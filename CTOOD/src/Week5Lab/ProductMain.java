package Week5Lab;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Product p1=new Product();
		System.out.println("Enter name,ID,Quantity in KG,Price per KG");
		Product p2=new Product(sc.nextLine(),sc.nextLong(),sc.nextInt(),sc.nextInt());
		Product p3=new Product(p2);	
		System.out.println(p1+"\n");
		System.out.println(p2);
		System.out.println(p3);
		sc.close();
	}

}
