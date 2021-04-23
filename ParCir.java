import java.awt.*;
import java.applet.*;
/* <applet code = "ParCir" width = 1000 height = 800>
   </applet> */
public class ParCir extends Applet 
{ public void paint(Graphics g)
  { for (int t = 0; t<=360; t++)  // angle in degrees
  	{ double r = 3.141592/180 * t;    // angle in radians
      // center = (500,350) and radius = 100
  	  int x = (int) ( 100 * Math.cos(r));
  	  int y = (int) ( 100 * Math.sin(r));
  	  g.setColor(Color.BLACK);
  	  g.drawLine(500,350,500 + x, 350 + y);
      for(int i = 0; i <= 10000000; i++);
      g.setColor(Color.WHITE);
      g.drawLine(500,350,500 + x, 350 + y);
      g.setColor(Color.BLACK);
      g.drawOval(500 + x, 350 + y,1,1);
  	}
  } 
}
