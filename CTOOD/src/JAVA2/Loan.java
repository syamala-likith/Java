package JAVA2;

public class Loan 
{
	static long loanamount,year,roi;
	public static void main(String[] args) 
	{
		new Loan(100000,3);
		display();
	}
	Loan(long loanamount,long year)
	{
		this();
		this.loanamount=loanamount;
		this.year=year;
	}
	Loan()
	{
		loanamount=0;
		year=0;
		roi=0;
	}
	static void display()
	{
		System.out.println("Loan Amount:"+loanamount);
		System.out.println("Year:"+year);
		System.out.println("ROI:"+roi);
	}
}
