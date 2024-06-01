package thread;

public class MyThread extends Thread 
{
	//The Total class is called as Defining a Thread
	public void run()
	{
		//the statements in run() method is Job of the Thread
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
