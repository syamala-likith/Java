package thread;

public class ThreadSleep extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String args[])
	{
		ThreadSleep ts1=new ThreadSleep();
		ThreadSleep ts2=new ThreadSleep();
		ts1.start();
		ts2.start();
		//https://rha.ole.redhat.com/rha/app/summary
	}
}