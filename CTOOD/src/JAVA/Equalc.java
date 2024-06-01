
package JAVA;


public class Equalc
{

public static void main(String[] args)
{
Equalc2.a=20;
Equalc2.b=10;
Equalc2.c=10;
if(Equalc2.checkNumber())
System.out.println("Equal");
else
System.out.println("Not Equal");
}

public class Equalc2
{
static int a,b,c;
static boolean checkNumber()
{
if(a==b && a==c)
return true;
else
return false;
}
}

}