/* Parameterized Constructors */
class Box
{
   double width;
   double height;
   double depth;
    
   Box(double w, double h,double d)
   {
       System.out.println("Constructing a Box");
	   width=w;
	   height=h;
	   depth=d;
   }
   double volume()
   {
       return width * height * depth;
   }
}
class BoxDemo7
{
    public static void main(String args[])
	{
	    Box b1 = new Box(10,20,15);
		Box b2 = new Box(3,6,9);
		double volume;
		
		volume= b1.volume();
		System.out.println("Volume of Box b1 = "+volume);
		
		volume= b2.volume();
		System.out.println("Volume of Box b1 = "+volume);
	}
}