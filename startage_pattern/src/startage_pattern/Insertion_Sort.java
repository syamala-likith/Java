package startage_pattern;

public class Insertion_Sort implements Sorting_Interface_Main
{

	@Override
	public void sort(int[] a) 
	{
		int temp;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(int i=0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
