package PREPARATION;

import java.util.Comparator;

public class SortByIdEmployee implements Comparator<Employee>
{
	public int compare(Employee e1,Employee e2)
	{
		return (int) (e1.id-e2.id);
	}
}
