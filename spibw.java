import java.awt.*;
import java.applet.*;
/* <applet code = "spibw" width = 1000 height = 800>
   </applet> */
public class spibw extends Applet 
{ public void paint(Graphics g)
  { double r1 = 150; // radius of stationary circle
    double r2 = -50; // radius of moving circle
    int r = 80; // offset
    //int offset = 0;
    for ( int j = r; j >= 40; j -= 5)
    { for ( int t = 0; t <= 1200; t++) // angle in degees
      { double rad = 3.141592/180 * t; // angle in radians
      double c2x = ( r1 + r2 ) * Math.cos(rad); // x co-ordinate of center of moving circle
      double c2y = ( r1 + r2 ) * Math.sin(rad); // y co-ordinate of center of moving circle
      int x = (int) ( (j * Math.cos( (r1 + r2)/r2 * rad)) + c2x);
      int y = (int) ( (j * Math.sin( (r1 + r2)/r2 * rad)) + c2y);
      g.setColor(Color.BLACK);
      g.drawOval( 500 + x, 350 + y, 1, 1);
      for ( int i = 0; i <= 2000000; i++);
      }
      //offset += 10;
    }
  }
}