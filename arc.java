import java.awt.*;
import java.applet.*;
/* <applet code = "arc" width = 500 height = 500>
   </applet> */
public class arc extends Applet 
{ public void paint(Graphics g)
  { for (int t = 1; t <= 100; t++)
  	{ g.setColor(Color.BLACK);
  	  g.drawArc( 150, 150, 100, 100, t % 100, 5);
  	  g.drawArc( 150, 150, 100, 100, (10 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (20 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (30 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (40 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (50 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (60 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (70 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (80 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (90 + t) % 100, 5);
      for( int i = 0; i <= 100000000; i++);
      g.setColor(Color.WHITE);
      g.drawArc( 150, 150, 100, 100, t, 5);
  	  g.drawArc( 150, 150, 100, 100, (10 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (20 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (30 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (40 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (50 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (60 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (70 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (80 + t) % 100, 5);
      g.drawArc( 150, 150, 100, 100, (90 + t) % 100, 5);	
     }
   } 
 }