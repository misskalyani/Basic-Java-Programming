import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements AdjustmentListener
{
	JScrollBar j1;
	TextField t1;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		j1=new JScrollBar();
		//j1.setOrientation(0);
		//j1.setMinimum(0);
	//	j1.setMaximum(255);
		j1.setBounds(100,100,20,200);
		
		t1=new TextField(20);
		t1.setBounds(100,70,50,20);
		add(t1);add(j1);

			j1.addAdjustmentListener(this);
				
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
	    int r=j1.getValue();
	  
	    t1.setText(""+r);
	}
	public static void main(String ar[])
	{
	  new demo();
	}
}
