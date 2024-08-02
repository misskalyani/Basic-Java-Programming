import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class Car extends Applet implements ActionListener
{
	int i=0;
	Button b1,b2,b3;
	public void init()
	{
		setLayout(new FlowLayout());
		b1=new Button("Next");
		b2=new Button("Stop");
		b3=new Button("Back");
		add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	public void paint(Graphics g)
	{	
		
		g.drawRect(100+i,100,200,100);
		g.setColor(Color.red);
		g.fillRect(100+i,100,200,100);
		g.setColor(Color.white);
		g.fillOval(100+i,10,10,10);

		g.drawRect(300+i,105,20,90);
		g.setColor(Color.yellow);
		g.fillRect(300+i,105,40,90);

		/*g.drawRect(200+i,100,50,50);
		g.setColor(Color.pink);
		g.fillRect(200+i,100,50,50);*/

		g.setColor(Color.black);
		g.fillOval(120+i,200,30,30);
		g.setColor(Color.black);
		g.fillOval(150+i,200,30,30);
		g.setColor(Color.black);
		g.fillOval(200+i,200,30,30);
		g.setColor(Color.black);
		g.fillOval(200+i,200,30,30);
		g.setColor(Color.black);
		g.fillOval(230+i,200,30,30);


	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			for(i=0;i<=1000;i=i+(30))
			repaint();
		}
		if(ae.getSource()==b2)
		{
			stop();
		}
		if(ae.getSource()==b3)
		{
			for(i=0;i<=1000;i=i+(-30))
			
			repaint();
		}
	}
}