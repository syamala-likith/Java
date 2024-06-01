package JAVA1;

public class Palindrome {

	public static void main(String[] args) {
		int n;
		n=121;
		int temp;
		temp=findReverse(n);
		if(isPalindrome(temp,n))
		{
		System.out.println("It is Palindrome");
		}
		else
		{
		System.out.println("It is not Palindrome");
		}
		displayPalindrome(n);
		}
		public static int findReverse(int n)
		{
		int sum=0,r;
		while(n>0)
		{
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		}
		return sum;
		}
		static boolean isPalindrome(int temp,int n)
		{
		if(n==temp)
		{
		return true;
		}
		else
		{
		return false;
		}
		}
		public static void displayPalindrome(int n)
		{
		int i;
		for(i=1;i<=n;i++)
		{
			if(findReverse(i)==i)
			{
				System.out.println(i);
			}
		}


		} 

	}