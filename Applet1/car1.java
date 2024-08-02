import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class car1 extends Applet
{
    

    public void paint(Graphics g) 
    {
        // Draw car body
        g.setColor(Color.RED);
        g.fillRect(50, 100, 200, 50);
        g.fillRect(75, 75, 150, 50);

        // Draw windows
        g.setColor(Color.CYAN);
        g.fillRect(110, 80, 30, 30);
        g.fillRect(160, 80, 30, 30);

        // Draw wheels
        g.setColor(Color.BLACK);
        g.fillOval(75, 140, 50, 50);
        g.fillOval(175, 140, 50, 50);
    }
}


/*w=getWidth();
		Color c1=new Color(20,160,200);
		Color c2=new Color(200,60,200);
		g.setColor(c1);
		g.setColor(c2);
		g.fillRoundRect(x,y+20,100,40,5,5);
		g.fillArc(x+90,y+20,20,40,270,180);
		g.setColor(c1);
		
		g.fillRoundRect(x+20,y,70,25,10,10);
		g.setColor(Color.white);
		g.fillRect(x+20,y+5,20,25);
		g.setColor(Color.black);
		g.fillRoundRect(x+55,y+10,10,20,10,10);
		g.fillOval(x+10,y+50,25,25);
		g.fillOval(x+60,y+50,25,25);
		g.setColor(Color.white);
		g.fillOval(x+15,y+55,10,10);
		g.fillOval(x+65,y+55,10,10);
		x=x+10;
		slep();
		if(x+100<w)
		{
			repaint();
		}
		else
		{
			repaint();
			x=20;
			y=y+30;
		}*/
