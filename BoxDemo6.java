/* Constructors */
class Box
{
   double width;
   double height;
   double depth;
    
   Box()
   {
       System.out.println("Constructing a Box");
	   width=10;
	   height=10;
	   depth=10;
   }
   double volume()
   {
       return width * height * depth;
   }
}
class BoxDemo6
{
    public static void main(String args[])
	{
	    Box b1 = new Box();
		Box b2 = new Box();
		double volume;
		
		volume= b1.volume();
		System.out.println("Volume of Box b1 = "+volume);
		
		volume= b2.volume();
		System.out.println("Volume of Box b1 = "+volume);
	}
}