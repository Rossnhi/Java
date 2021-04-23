import java.awt.*;
import java.applet.*;
/* <applet code = "Square" width = 500 height = 500>
   </applet> */
public class Square extends Applet
{ public void paint(Graphics g)
  { for( int i =0; i<=700; i++)
    {g.setColor(Color.BLACK);
     g.drawRect(30+i,30+i,50,50);
     for(int t=0; t<=100000000; t++);
     g.setColor(Color.WHITE);
     g.drawRect(30+i,30+i,50,50);
    }
  }
}