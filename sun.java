import java.awt.*;
import java.applet.*;
/* <applet code = "sun" width = 1000 height = 800>
   </applet> */
public class sun extends Applet 
{ public void paint( Graphics g)
  { for( int t = -170; t <= -10; t++)
  	{ g.setColor(Color.CYAN);
  	  g.fillRect( 0, 0, 1000, 500);
  	  g.setColor(Color.GREEN);
      g.fillRect(0, 500, 1000, 300);
  	  g.setColor(Color.ORANGE);
  	  int x1 = (int) ( 350 * Math.cos(t * 3.14/ 180));
  	  int y1 = (int) ( 270 * Math.sin(t * 3.14/180));
  	  int x2 = (int) ( 336 * Math.cos(t * 3.14/180));
  	  int y2 = (int) ( 262 * Math.sin(t * 3.14/180));
  	  g.fillOval( 475 + x1, 400 + y1, 120, 120);
  	  g.setColor(Color.YELLOW);
  	  g.fillOval( 475 + x2, 400 + y2, 112,112);
      g.setColor(Color.GRAY);
      int mx[] = { 0, 0, 125, 250, 375, 500, 625, 750, 875, 1000, 1000};
      int my[] = { 500, 400, 100, 400, 250, 400, 150, 400, 200, 400, 500};
      g.fillPolygon( mx, my, 11);
      for ( int i = 0; i <= 50000000; i++); 
	  }  
  } 
}