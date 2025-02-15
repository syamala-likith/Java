package startage_pattern;

public class Shell_Sort implements Sorting_Interface_Main
{
	@Override
	public void sort(int[] a)
	{
		int n=a.length;
		int k,j;
		for(int gap=n/2;gap>0;gap=gap/2)
		{
			for(int i=gap;i<n;i++)
			{
				k=a[i];
				j=i-gap;
				while(j>=0 && k<a[j])
				{
					a[j+gap]=a[j];
					j=j-gap;
				}
				a[j+gap]=k;
			}
		}
		for(int i=0; i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}
