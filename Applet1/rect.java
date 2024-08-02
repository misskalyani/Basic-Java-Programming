import java.awt.event.*;
import java.applet.*;
import java.awt.*;
public class rect extends Applet implements ActionListener
{
      int x1,x2,y1,y2;
      public void init()
      {
        addMouseListener(this);
      }
      public void mousePressed(MouseEvent me)
      {
          x1=me.getX();
          y1=me.getY();
      }
      public void mouseReleased(MouseEvent me)
      {
          x2=me.getX();
          y2=me.getY();
          repaint();
      }
      public void mouseClicked(MouseEvent me)
      {
      
      }
      public void mouseEntered(MouseEvent me)
      {
      
      }
      public void mouseExited(MouseEvent me)
      {
      
      }
      public void update(Graphics g)
      {
          g.drawRect(x1,y1,x2-x1,y2-y1);      
      }
}
