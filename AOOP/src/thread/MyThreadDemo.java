package thread;

public class MyThreadDemo 
{
	public static void main(String args[])
	{
		MyThread t=new MyThread();//Thread instantiation
		t.start();//Starting a Thread 
		//t.run();//
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}
