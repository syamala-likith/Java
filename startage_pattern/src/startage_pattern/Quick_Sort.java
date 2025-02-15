package startage_pattern;

public class Quick_Sort implements Sorting_Interface_Main
{
	int[] a; 
	@Override
	public void sort(int[] a) 
	{
		this.a=a;
		int n=a.length;
		quicksort(0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void quicksort(int low,int high)
	{
	    int pivotpos;
	    if(low<high)
	    {
	        pivotpos=partition(low,high+1);
	        quicksort(low,pivotpos-1);
	        quicksort(pivotpos+1,high);
	    }
	}
	int partition(int low,int high)
	{
	    int pivot=a[low];
	    int up=low,down=high;
	    do
	    {
	        do
	        {
	            up=up+1;
	        }while(a[up]<pivot);
	        do
	        {
	            down=down-1;
	        }while(a[down]>pivot);
	        if(up<down)
	        {
	            int temp; 
	            temp=a[up];
	            a[up]=a[down];
	            a[down]=temp;
	        }
	    }while(up<down);
	    a[low]=a[down];
	    a[down]=pivot;
	    return down;
	}
}
