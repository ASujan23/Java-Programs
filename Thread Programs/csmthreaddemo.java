class csmthread implements Runnable
{
   Thread t;
   
   csmthread()
   {
        t = new Thread(this,"DemoThread");
		System.out.println("csm thread : "+t);
		t.start();
   }
   public void run()
   {
      try
	  {
	      for(int i=5; i>0; i--)
		  {
		     System.out.println("Child Thread: "+i);
	         t.sleep(1000);	
		  }
	  }
	  catch(InterruptedException e)
	  {
	       System.out.println("Child Interrupted");
	  }
	  
	  System.out.println("Exiting Child Thread");
	  //System.out.println("csm thread exited");
   }
}
class csmthreaddemo
{
     public static void main(String args[])
	 {
	     new csmthread();
		 
		try
		{
	      for(int i=5; i>0; i--)
		  {
		     System.out.println("Main Thread: "+i);
	         Thread.sleep(2000);		 
		  }
		}
		catch(InterruptedException e)
		{
	       System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main Thread Exiting ");
		//System.out.println("Main Thread exited");
		 
	 }
}