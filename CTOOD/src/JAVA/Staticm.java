

package JAVA;

public class Staticm
{
static int a=m();
public static void main(String[] args)
{
System.out.println("In main method");
}
static
{
a=10;
System.out.println("In statsic method\n"+a);
//System.out.println(a);
}
static int m()
{
System.out.println("In Method");
return 20;
}
}

