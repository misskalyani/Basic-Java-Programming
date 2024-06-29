import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements AdjustmentListener
{
	JScrollBar j1,j2,j3;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1=new JScrollBar();
		j1.setOrientation(0);
		j1.setMinimum(0);
		j1.setMaximum(255);
		
		j2=new JScrollBar();
		j2.setOrientation(1);
		j2.setMinimum(0);
		j2.setMaximum(255);
		
		j3=new JScrollBar();
		j3.setOrientation(0);
		j3.setMinimum(0);
		j3.setMaximum(255);
		
		add(j1,BorderLayout.NORTH);
		add(j2,BorderLayout.EAST);
		add(j3,BorderLayout.SOUTH);
		j1.addAdjustmentListener(this);
		j2.addAdjustmentListener(this);
		j3.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int red=j1.getValue();
		int green=j2.getValue();
		int b=j3.getValue();
		Color c=new Color(red,green,b);
		setBackground(c);
	}
	public static void main(String g[])
	{
		new demo();
	}
}
