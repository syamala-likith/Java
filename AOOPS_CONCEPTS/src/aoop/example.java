package aoop;

import java.util.Scanner;

public class example {

	static int t,a,b,c;
	  public static void main (String[] args) throws java.lang.Exception
	  {
	      Scanner sc=new Scanner(System.in);
	  t=sc.nextInt();
	  while(t-->0)
	  {
	      a=sc.nextInt();
	      b=sc.nextInt();
	      c=sc.nextInt();
	      if(a>=10&&b>=10&&c>=10&&(a+b+c)>=100)
	      {
	          System.out.println("PASS\n");
	      }
	      else
	      {
	          System.out.println("FAIL\n");
	      }
	  }
	  }
	}


