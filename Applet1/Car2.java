import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Car2 extends Applet implements KeyListener
{
    void slep()            
 {
  try 
  {
   Thread.sleep(100);
  }
   catch(Exception ex) 
   {
   }
 }
 int x=600,y=360;
 public void paint(Graphics g)
 {

  addKeyListener(this);
  setBackground(Color.gray);
  g.setColor(Color.black);
  g.drawOval(x-2,y+15,7,20);
  g.fillOval(x-2,y+15,7,20);
  g.drawOval(x-2,y+75,7,20);
  g.fillOval(x-2,y+75,7,20);
  g.setColor(Color.blue);
  g.drawRoundRect(x,y,76,105,10,20);
  g.fillRoundRect(x,y,76,105,10,20);
  g.setColor(Color.black);
  g.drawRect(x+7,y+75,62,18);
  g.fillRect(x+7,y+75,62,18);
  g.setColor(Color.red);
  g.drawOval(x+4,y+95,6,9); 
  g.drawOval(x+66,y+95,6,9);
  g.fillOval( x+4,y+95,6,9);
  g.fillOval( x+66,y+95,6,9);
  g.setColor(Color.black);
  g.drawRoundRect(x+7,y+35,63,35,10,20);

  g.setColor(Color.yellow);
  g.drawOval(x+4,y+1,9,15);
  g.drawOval(x+3,y+1,9,15);
  g.fillOval(x+63,y+1,9,15);
  g.fillOval(x+4,y+1,9,15);

  slep();

 }
 public void keyPressed(KeyEvent ke){
    int KeyCode = ke.getKeyCode();

    switch(KeyCode)
    {
        case KeyEvent.VK_UP:
        if(y>0)
        y=y-1;
        break;
        case KeyEvent.VK_DOWN:
        if(y<getHeight()-105)
        y=y+1;
        break;
        case KeyEvent.VK_LEFT:
        if(x>0)
        x=x-1;
        break;
        case KeyEvent.VK_RIGHT:
        if(x<getWidth()-76)
        x++;
        break;
    }
    repaint();
 }

 public void keyTyped(KeyEvent ke) {
    
 } 

 public void keyReleased(KeyEvent ke){
 }


 

}