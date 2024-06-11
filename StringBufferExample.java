public class StringBufferExample 
{
	public static void main(String[] args) 
	{
		
		StringBuffer sb1 = new StringBuffer("AITAM");
		StringBuffer sb2 = new StringBuffer("AITAM");
		StringBuffer sb3 = new StringBuffer("AITAM");
		StringBuffer sb4 = new StringBuffer("AITAM");
				
		System.out.println(sb2.insert(0, "for "));
		System.out.println(sb3.replace(0,5,"Udita"));
		System.out.println(sb4.reverse());
		
	}
}