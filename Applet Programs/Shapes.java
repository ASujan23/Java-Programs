import java.awt.*;
import java.applet.*;

/*
<applet code="Shapes.class" width=900 height=500></applet> 
*/

public class Shapes extends Applet 
{
  public void init() 
  {
      setBackground(Color.yellow);
  }
  public void start() 
  {
     // start or resume execution
  }
  public void stop() 
  {
     // suspends execution
  }
  public void destroy() 
  {
     // perform shutdown activities
  }
  public void paint(Graphics g) 
  {
     //g.drawString("Aditya Institute Of Technology And Management",40,50);
	 g.drawLine(100,100,200,100);
	 g.drawRect(150,150,250,50);
	 g.drawOval(300,300,350,50);
  }
}  
