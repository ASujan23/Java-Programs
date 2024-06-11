/* Returning a value */
class Box
{
   double width;
   double height;
   double depth;
   
   double volume()
   {    
	  return width * height*depth;
   }
}
class BoxDemo4
{
    public static void main(String args[])
	{
	    Box b1 = new Box();
		Box b2 = new Box();
		double volume;
		
		b1.width=20;
		b1.height=40;
		b1.depth=10;
		
		volume= b1.volume();
		System.out.println("Volume of Box b1 = "+volume);
		
		b2.width=9;
		b2.height=12;
		b2.depth=6;
		
		volume= b2.volume();
		System.out.println("Volume of Box b1 = "+volume);
	}
}