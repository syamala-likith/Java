package HA1;

public class ConditionAndLoops 
{

	public static void main(String[] args)
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		i=0;
		while(i<5)
		{
			System.out.print(i+" ");
			i=i+1;
		}
		System.out.println();
		i=0;
		do
		{
			System.out.print(i+" ");
			i=i+1;
		}while(i<5);
		System.out.println();
		for(i=0;i<5;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"Is Even Number");
			}
		}
	}
}
/*
 Conditional Statement Syntax--
                              if(condition)
                              {
                              	if condition true the Statement will executed
                              }
                              else if(condition2)
                              {
                              	if 1st condition is true the else if part will not executed
                              	if 1st condition is false but the 2nd
                              	condition is true then the Statement will executed
                              }
                              else
                              {
                              	if condition false the Statement will executed
                              }
                              
                              	
Loops----
		For loop--
					for(initialization;condition;updation)
					{
						till the condition is true the loop will executes
					}
					
		While loop--
					initialization;
					while(condition)
					{
						till the condition is true the loop will executes
						updation;
					}
					
		Do-While loop--
						initialization;
						do
						{
							for the 1st time the loop executes and checks the condition
							till the condition is true the loop will executes
							updation;
						}while(condition);
                              
 */
