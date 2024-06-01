package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EmployeeThread extends Thread {
   private String message;
   public EmployeeThread(String s) {
      this.message=s;
   }
   public void run() {
      System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
      try
      { 
    	  Thread.sleep(1000);
      }
      catch (InterruptedException e){ }
      System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
   }
}