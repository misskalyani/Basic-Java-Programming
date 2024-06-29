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
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		j1=new JScrollBar();
		j1.setOrientation(0);
		j1.setMinimum(0);
		j1.setMaximum(255);
		j1.setBounds(100,100,300,30);
		
		j2=new JScrollBar();
		j2.setOrientation(0);
		j2.setMinimum(0);
		j2.setMaximum(255);
		j2.setBounds(100,200,300,30);
		
		j3=new JScrollBar();
		j3.setOrientation(0);
		j3.setMinimum(0);
		j3.setMaximum(255);
		j3.setBounds(100,300,300,30);
		
		add(j1);add(j2);
		add(j3);
		j1.addAdjustmentListener(this);
			j2.addAdjustmentListener(this);
				j3.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
	    int r=j1.getValue();
	    int g=j2.getValue();
	    int b=j3.getValue();
	    
	    Color c=new Color(r,g,b);
	    setBackground(c);
	}
	public static void main(String ar[])
	{
	  new demo();
	}
}
