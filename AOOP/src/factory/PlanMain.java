package factory;

import java.util.Scanner;

public class PlanMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PlanFactory pf=new PlanFactory();
		System.out.println("Enter The Plan");
		Plan p=pf.getInstance(sc.next());
		p.getRate();
		p.calculateBill(100);
	}

}
