/* Adding a method to the class Box */
class Box
{
   double width;
   double height;
   double depth;
   
   void volume()
   {
      double vol;
	  vol=width * height*depth;
	  System.out.println("Volume is = "+vol);
   }
}
class BoxDemo3
{
    public static void main(String args[])
	{
	    Box b1 = new Box();
		Box b2 = new Box();
		double volume;
		
		b1.width=10;
		b1.height=10;
		b1.depth=10;
		
		b1.volume();
		
		b2.width=4;
		b2.height=10;
		b2.depth=9;
		
		b2.volume();
	}
}