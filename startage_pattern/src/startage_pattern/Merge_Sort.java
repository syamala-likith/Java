package startage_pattern;

public class Merge_Sort implements Sorting_Interface_Main 
{
	int[] a,b;
	@Override
	public void sort(int[] a) 
	{
		this.a=a;
		int n=a.length;
		this.b=new int[n];
		sort1(0,n-1);
		for(int i=0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	int[] sort1(int low,int high)
	{
	    int mid;
	    if(low<high)
	    {
	        mid=(low+high)/2;
	        sort1(low,mid);
	        sort1(mid+1,high);
	        merging(low,mid,high);
	    }
		return a;
	}
	void merging(int low,int mid,int high)
	{
	    int l1,l2,i;
	    for(l1=low,l2=mid+1,i=low;l1<=mid && l2<=high;i=i+1)
	    {
	        if(a[l1]<=a[l2])
	        {
	            b[i]=a[l1];
	            l1=l1+1;
	        }
	        else
	        {
	            b[i]=a[l2];
	            l2=l2+1;
	        }
	    }
	    while(l1<=mid)
	    {
	        b[i]=a[l1];
	        i=i+1;
	        l1=l1+1;
	    }
	    while(l2<=high)
	    {
	        b[i]=a[l2];
	        i=i+1;
	        l2=l2+1;
	    }
	    for(i=low;i<=high;i++)
	    {
	        a[i]=b[i];
	    }
	}
}
