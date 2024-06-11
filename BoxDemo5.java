/* Adding a method that takes a parameters */
class Box
{
   double width;
   double height;
   double depth;
   
   double volume()
   {    
	  return width * height*depth;
   }
   
   void setDimensions(double w, double h,double d)
   {
      width=w;
	  height=h;
	  depth=d;
   }
}
class BoxDemo5
{
    public static void main(String args[])
	{
	    Box b1 = new Box();
		Box b2 = new Box();
		double volume;
		
		b1.setDimensions(10,20,15);
		b2.setDimensions(3,6,9);
		
		volume= b1.volume();
		System.out.println("Volume of Box b1 = "+volume);
		
		volume= b2.volume();
		System.out.println("Volume of Box b1 = "+volume);
	}
}