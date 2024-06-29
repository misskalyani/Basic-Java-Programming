import java.awt.*;
import java.applet.*;
public class Gdemo extends Applet
{
	public void paint(Graphics g)
	{
	  g.drawString("Welcome Kalyani...!",150,10);
	  
		
		g.drawLine(10,20,300,500);
		g.drawRect(100,50,100,300);
		g.fillRect(250,50,100,300);
		g.drawRoundRect(400,50,100,300,50,50);
		g.drawOval(100,400,100,100);
		g.setColor(Color.cycan);
		g.fillArc(300,300,100,100,200,200);
		g.setColor(Color.red);
		int a={100,550,300,600,50};
		int b={100,150,200,300,500};
		g.drawPolygon(a,b,5);
	}
}
