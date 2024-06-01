

package JAVA;

public class Equal
{
static int a=10,b=10,c=20;
public static void main(String[] args)
{
if(checkNumber())
System.out.println("Equal");
else
System.out.println("Not Equal");
}
static boolean checkNumber()
{
if(a==b && a==c)
return true;
else
return false;
}
}

