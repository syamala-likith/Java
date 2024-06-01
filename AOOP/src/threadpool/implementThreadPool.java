package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class implementThreadPool 
{
	   public static void main(String[] args) 
	   {
	      ExecutorService executor = Executors.newFixedThreadPool(3); //creating a pool of 6 threads
	      for (int m = 0; m< 6; m++) 
	      {
	         EmployeeThread worker = new EmployeeThread("" + m);
	         executor.execute(worker); //calling execute method of ExecutorService
	      }
	      executor.shutdown();
	   }
	}