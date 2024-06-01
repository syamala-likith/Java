package Preparation1;
import java.util.*;
public class SortByWeight implements Comparator<Student>
{
	public int compare(Student s1,Student s2)
	{
		return (int) (s1.weight-s2.weight);
	}
}
