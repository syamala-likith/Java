package Week5Lab;

import java.util.Scanner;

public class QudraticEquationsMain 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		QudraticEquations q=new QudraticEquations();
		System.out.println("Enter the Co-efficients vlaues of ax^2+bx+c");
		q.setABC(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println(q);
		sc.close();
	}

}
