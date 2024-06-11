class ThreadDemo
{
    public static void main(String args[])
	{
	     Thread t = Thread.currentThread();
		 System.out.println("\n\nCurrentThread: "+t);
		 t.setName("AdityaCollege");
		 t.setPriority(2);
		 
		 System.out.println("\n\nAfter Name Change: "+t+"\n");
		 try
		 {
		      for(int i=5;i>0;i--)
			  {
			     System.out.println(" "+i+"\n");
				 Thread.sleep(5000);
			  }
		 }
		 catch(InterruptedException e)
		 {
		     System.out.println("\n\nMain Thread Interrupted");
		 }
	}
}