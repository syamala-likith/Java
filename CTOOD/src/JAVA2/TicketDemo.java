package JAVA2;

import java.util.Scanner;

import JAVA1.Ticket;

public class TicketDemo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();
		System.out.println("Enter Mobile Number");
		t.setMn(sc.nextLong());
		System.out.println("Enter Total Number Of Seats In Theater");
		t.setNs(sc.nextInt());
		System.out.println("Enter Number Of Seats To Be Booked");
		int n=sc.nextInt();
		t.tsb=t.tsb+n;
		t.setNs((t.getNs()-n));
		System.out.println("The Total Number Of Seats Booked:"+t.tsb);
		System.out.println("Total Number Of Seats Available:"+t.getNs());
		sc.close();
	}

}
