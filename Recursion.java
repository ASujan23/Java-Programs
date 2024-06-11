/* Recursion */
class Factorial
{
   int factorial(int n)
   {
       int result;
	   
	   if(n==1)
	   {
	     return 1;
	   }	 
	   else
	   {
         result = factorial(n-1)*n;
	   }	 
       return result;		 
   }
}
class Recursion
{
    public static void main(String args[])
	{
	    Factorial f = new Factorial();
		
		System.out.println("Factorial of 7 is :"+f.factorial(7));
	}
}
