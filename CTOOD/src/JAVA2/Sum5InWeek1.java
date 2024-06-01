package JAVA2;

public class Sum5InWeek1 
{
	public static void main(String args[])
	{
		int a[]=new int[100];
		    int n=111111101;
		    int i=0,j;
		    int r;
		    int count=0;
		    while(n>0)
		    {
		        r=n%10;
		        if(r==1)
		        {
		            count=count+1;
		            a[i]=count;
		        }
		        else
		        {
		            count=0;
		            i=i+1;
		        }
		        n=n/10;
		    }
		    int max=a[0];
		    for(j=0;j<=i;j++)
		    {
		        if(max<a[j])
		        {
		            max=a[j];
		        }
		    }
		    System.out.println(max);
		}
	}
