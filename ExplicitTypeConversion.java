/* Explicit Type Conversion (A cast is simply an explicit type conversion)*/

class ExplicitTypeConversion
{
	public static void main(String args[])
	{
		byte b = 50;
	
		//b = (byte)(b*2);
		b = b*2;
		System.out.println("The result is: "+ b);
	}
}