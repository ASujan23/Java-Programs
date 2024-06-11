/* Call By value */
class Test
{
    void method1(int i,int j)
	{
	    i=i*2;
		j=j/2;
	}
}
class CallByValue
{
    public static void main(String args[])
	{
	    Test ob = new Test();
		int a=15,b=20;
		System.out.println("a and b before call : "+ a +"  "+b);
		
		ob.method1(a,b);
		System.out.println("a and b after call : "+ a +"  "+b);
	}
}