/* Use of this operator */
class Box
{
   double width;
   double height;
   double depth;
    
   Box(double width, double height,double depth)
   {
       System.out.println("Constructing a Box");
	   this.width=width;
	   this.height=height;
	   this.depth=depth;
   }
   double volume()
   {
       return width * height * depth;
   }
}
class BoxDemo8
{
    public static void main(String args[])
	{
	    Box b1 = new Box(99,15,10);
		Box b2 = new Box(5,10,9);
		double volume;
		
		volume= b1.volume();
		System.out.println("Volume of Box b1 = "+volume);
		
		volume= b2.volume();
		System.out.println("Volume of Box b1 = "+volume);
	}
}