
import java.applet;
import java.awt.*;
public class Graphics extends Applet
{
	public void paint(Graphics g)
	{
		Font f1=new Font("Arial",Font.BOLD,25);
		g.setFont(f1);
		g.drawString("Welcome Kalyani",100,100);
		g.drawRect(100,100,200,50);//x y width height
		g.drawOval(100,200,100,150);//x y w h
		g.drawLine(100,200,300,300);//x1 y1 x2 y2
		g.setColor(Color.red);
		g.fillOval(300,200,100,100);
		g.setColor(Color.pink);
		g.fillRect(100,300,200,50);
		g.drawArc(100,100,200,200,90,360);
	}
}
