import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class car extends Applet implements ActionListener 
{
	int i;
	Button b1,b2;
	public void init()
	{
		b1= new Button("next");
		b2=new Button("stop");
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
		
	}
	public void paint(Graphics g)
	{
		g.drawRect(100+i,100,100,50);
		g.fillOval(120+i,150,30,30);
		g.fillOval(150+i,150,30,30);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			i=i+30;
			repaint();
		}
		if(ae.getSource()==b2)
		{
			stop();
		}
	}
	
}
