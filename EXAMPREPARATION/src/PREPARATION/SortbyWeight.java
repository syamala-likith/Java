package PREPARATION;

import java.util.Comparator;

public  class SortbyWeight implements Comparator<Student> {

	
	public int compare(Student o1,Student o2) {
		
		return (int)(o1.weight-o2.weight);
	}

	}