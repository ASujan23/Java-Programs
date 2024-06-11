import java.awt.*;
import java.applet.*;
/*
<applet code="AppletSkel" width=500 height=100></applet> 
*/

public class AppletSkel extends Applet 
{
  public void init() 
  {
      // initialization
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
     g.drawString("Welcome",40,50);
  }
}  
