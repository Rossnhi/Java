import java.awt.*;
import java.applet.*;
/* <applet code = "sin" width = 1000 height = 800>
   </applet> */
public class sin extends Applet 
{ public void paint(Graphics g)
  { for (int x = 0; x <= 1000; x++)  // angle in degrees
  	{ double r = 3.141592/180 * x;   // angle in radians
  	  int y = (int) (100 * Math.sin(r));
      g.drawOval( x, 400 + y, 1,1);
    }
  }
}