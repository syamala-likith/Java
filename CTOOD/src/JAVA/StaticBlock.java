
package JAVA;

public class StaticBlock
{
static int a=10,b=20;
public static void main(String[] args)
{
System.out.println(a);
System.out.println(b);
sum();
}
static
{
System.out.println("In static block");
}
static void sum()
{
System.out.println("Sum is :"+(a+b));
}
}

