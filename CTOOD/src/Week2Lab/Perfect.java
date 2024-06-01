package Week2Lab;

public class Perfect {

	public static void main(String[] args) {
		int n=8128,m=3;
        if(isFactor(n,m))
        	System.out.println(n+ " is factor of "+m);
        else
        	System.out.println("Not factor");
        if(isPerfect(n))
        	System.out.println("It is perfect number");
        else
        	System.out.println("It is not perfect number");
        displayPerfectNos(n);
	}
	 public static boolean isFactor(int n,int m)
	    {
	        if(n%m==0)
	        {
	            return true;
	        }
	        else{
	            return false;
	        }
	    }

	    public static boolean isPerfect(int n)
	    {
	        int sum=0;
	        for(int i=1;i<n;i++)
	        {
	            if(isFactor(n,i))
	            {
	                sum+=i;
	            }
	        }
	        if(sum==n)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }

	    public static void displayPerfectNos(int n)
	    {
	        for(int i=1;i<n;i++)
	        {
	            if(isPerfect(i))
	            {
	                System.out.println(i);
	            }
	        }
	    }


}