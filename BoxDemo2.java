// This program declares two Box objects.
class Box
{
   double width;
   double height;
   double depth;
}
class BoxDemo2
{
    public static void main(String args[])
	{
	    Box mybox1 = new Box();
		Box mybox2 = new Box();
		double volume;
		
		// assign values to mybox1's instance variables
		mybox1.width=10;
		mybox1.height=10;
		mybox1.depth=10;
		
		// compute volume of first box
		volume= mybox1.width * mybox1.height * mybox1.depth;
		
		System.out.println("Volume of Box mybox1 = "+volume);
		
		/* assign different values to mybox2's instance variables */		
		mybox2.width=6;
		mybox2.height=9;
		mybox2.depth=7;
		
		// compute volume of second box
		volume= mybox2.width * mybox2.height * mybox2.depth;
		
		System.out.println("Volume of Box mybox2 = "+volume);
	}
}