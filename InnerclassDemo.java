//Demonstrate an inner class
class Outer
{
   int outer_x=100;
   
   void test()
   {
      Inner inn = new Inner();
	  inn.display();
   }
   class Inner
   {
      void display()
	  {
	    System.out.println("display: outer_x = "+outer_x);
	  }
   }
}
class InnerclassDemo
{
    public static void main(String args[])
	{
	   Outer ou = new Outer();
	   ou.test();
	}
}