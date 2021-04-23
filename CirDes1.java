import java.awt.*;
import java.applet.*;
/* <applet code = "CirDes1" width = 1000 height = 800>
   </applet> */
public class CirDes1 extends Applet 
{ public void paint(Graphics g)
  { 
  	int s = 1;
  	while(s <= 8)
  	{ for (int t = 0; t<=360; t++) 
  	  { double r = 3.141592/180 * t;    
  	    int x = (int) ( 100 * Math.cos(r));
  	    int y = (int) ( 100 * Math.sin(r));
  	    if (s%2==1)
  	    g.setColor(Color.BLACK);
  	    else
  	    g.setColor(Color.WHITE);
  	    g.drawLine( s * 100,350, s * 100 + x, 350 + y);
      }
      s++;
    }  
  }
}