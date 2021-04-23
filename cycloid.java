import java.awt.*;
import java.applet.*;
/* <applet code = "cycloid" width = 1000 height = 800>
   </applet> */
public class cycloid extends Applet 
{ public void paint(Graphics g)
  { g.setColor(Color.BLACK);
    g.fillRect(0, 0, 2000, 1000 );
    g.setColor(Color.WHITE);
    int rad = 50; // radius
    g.drawLine(0, 350 + rad , 2000, 350 + rad); //base
    for (int t = -90; t<=2000; t++)  // angle in degrees
  	{ double r = 3.141592/180 * t;    // angle in radians
      int x = (int) (( rad * Math.cos(r)) + (rad * 3.151592 * t/180));
  	  int y = (int) ( rad * Math.sin(r));
      int delx = (int) (rad * 3.151592 * t/180);
      // center of circle = ( 50 + delx, 350)
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
      for( int i = 0; i <=5000000; i++);  // animation time
      g.drawOval( x, 350 + y, 1, 1); // point p on circumference of big circle
    }  
  } 
}
