import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class image extends Applet implements ItemListener
{
	Choice c1;
	Image img;
	public void init()
	{
		c1=new Choice();
		c1.add("img1");
		c1.add("img2");
		c1.add("img3");
		add(c1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			String s1=c1.getSelectedItem();
		img=getImage(getDocumentBase(),s1+".jpg");
		
		//img=getImage(getCodeBase(),s1+".jpg");
		repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.drawImage(img,100,100,this);
	}
}
