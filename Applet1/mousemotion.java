import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mousemotion extends Applet implements MouseMotionListener
{
	int x,y;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void update(Graphics g)
	{
		g.fillOval(x,y,3,5);
		//g.drawOval(x,y,5,5);
	}
	public void mouseMoved(MouseEvent me)
	{
	
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
}
