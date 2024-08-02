import java.applet.*;
import java.awt.*;
public class sk1 extends Applet
{
	int x,z,w;
	void slep()
	{
		try
		{
			Thread.sleep(100);
		}
		catch(Exception ob)
		{}
	}
	public void init()
	{
		x=20;
		z=650;
	}
	public void paint(Graphics g)
	{
		setBackground(Color.pink);
		w=getWidth();		
	
		
		  // Draw car body
        g.setColor(Color.RED);
        g.fillRect(x+1650, z+70, 200, 50);
        g.fillRect(x+1680, z+25, 150, 50);

        // Draw windows
        g.setColor(Color.CYAN);
        g.fillRect(x+1700, z+30, 30, 30);
        g.fillRect(x+1780, z+30, 30, 30);

        // Draw wheels
        g.setColor(Color.BLACK);
        g.fillOval(x+1680, z+90, 50, 50);
        g.fillOval(x+1780, z+90, 50, 50);
	x=x-10;//speed
		slep();
		if(x+100<w)
		{
			repaint();
		}
		else
		{
			repaint();
			z=20;
			//x=x+30;
		}
	}
}
/*<applet code="sk1" height="500" width="500">
</applet>*/