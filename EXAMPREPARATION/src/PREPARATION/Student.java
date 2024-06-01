package PREPARATION;

public class Student implements Comparable<Student>
{
	long id;
	String name;
	int age;
	double height,weight;
	public Student(long id, String name, int age, double height, double weight) 
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public int compareTo(Student o) {
		if(height==o.height)
			return 0;
		else if(height>o.height)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight+ "]";
	}
	

}