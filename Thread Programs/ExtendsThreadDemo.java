class NewThread extends Thread
{
   NewThread()
   {
        super("DemoThread");
		System.out.println("Chiled Thread : "+this);
		start();
   }
   public void run()
   {
      try
	  {
	      for(int i=5; i>0; i--)
		     System.out.println("Child Thread: "+i);
	      Thread.sleep(500);		 
	  }
	  catch(InterruptedException e)
	  {
	       System.out.println("Child Interrupted");
	  }
	  System.out.println("Exiting Child Thread");
   }
}
class ExtendsThreadDemo
{
     public static void main(String args[])
	 {
	     new NewThread();
		 
		 try
		{
	      for(int i=5; i>0; i--)
		  {
		     System.out.println("Main Thread: "+i);
	      Thread.sleep(1000);		 
		  }
		}
		catch(InterruptedException e)
		{
	       System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting ");
		 
	 }
}