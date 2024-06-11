//using more than one thread is called Multi Threading 
class Show extends Thread 
{
  String str; 
  Show (String str) 
  {  
    this.str = str; 
  } 
  public void run() 
  {  
    for (int i = 1; i <= 10 ; i++) 
    {  
	  System.out.println ("\n"+str + " : " + i); 
      try 
      {  
	     Thread.sleep (2000); 
      } 
      catch (InterruptedException e)   
	  {    
	     e.printStackTrace ();     
	  } 
    } 
  } 
} 
class MultipleThreadDemo
{
  public static void main(String args[]) 
  {  
     Show obj1 = new Show ("AITAM"); 
     Show obj2 = new Show ("AdityaCollege"); 
     Thread t1 = new Thread (obj1); 
     Thread t2 = new Thread (obj2); 
     t1.start (); 
     t2.start (); 
  } 
}       
