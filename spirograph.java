import java.awt.*;
import java.applet.*;
/* <applet code = "spirograph" width = 1000 height = 800>
   </applet> */
public class spirograph extends Applet 
{ public void paint(Graphics g)
  { g.fillRect(0, 0, 1000, 800);
    double r1 = 480; // radius of stationary circle
    double r2 = -340; // radius of moving circle
    int r = 60; // offset
    for ( int t = 0; t <= 10000; t++) // angle in degees
    { double rad = 3.141592/180 * t; // angle in radians
      double c2x = ( r1 + r2 ) * Math.cos(rad); // x co-ordinate of center of moving circle
      double c2y = ( r1 + r2 ) * Math.sin(rad); // y co-ordinate of center of moving circle
      int x = (int) ( (r * Math.cos( (r1 + r2)/r2 * rad)) + c2x);
      int y = (int) ( (r * Math.sin( (r1 + r2)/r2 * rad)) + c2y);
      if (t%800 <= 800)
      g.setColor(Color.PINK);
      if (t%800 <= 700)
      g.setColor(Color.CYAN);
      if (t%800 <= 600)
      g.setColor(Color.GREEN);
      if (t%800 <= 500)
      g.setColor(Color.RED);
      if (t%800 <= 400)
      g.setColor(Color.MAGENTA);
      if (t%800 <= 300)
      g.setColor(Color.BLUE);
      if (t%800 <= 200)
      g.setColor(Color.YELLOW);
      if (t%800 <= 100)
      g.setColor(Color.ORANGE);
      g.drawOval( 500 + x, 350 + y, 1, 1);
      for ( int i = 0; i <= 2000000; i++);
    } 
  }
}