/* Call By Reference */
class Test
{
    int a,b;
	Test(int i,int j)
	{
	   a=i;
	   b=j;
	}
    void method1(Test o)
	{
	    o.a=o.a*2;
		o.b=o.b/2;
	}
}
class CallByRef
{
    public static void main(String args[])
	{
	    Test ob = new Test(15,20);
		
		System.out.println("ob.a and ob.b before call : "+ ob.a +"  "+ob.b);
		
		ob.method1(ob);
		System.out.println("ob.a and ob.b after call : "+ ob.a +"  "+ob.b);
	}
}