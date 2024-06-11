class Box
{
   double width;
   double height;
   double depth;
}

// This class declares an object of type Box.
class BoxDemo
{
    public static void main(String args[])
	{
	    Box mybox = new Box();
		double volume;
		
		// assign values to mybox's instance variables
		mybox.width=10;
		mybox.height=10;
		mybox.depth=10;
		
		// compute volume of box
		volume= mybox.width * mybox.height * mybox.depth;
		
		System.out.println("Volume = "+volume);
	}
}