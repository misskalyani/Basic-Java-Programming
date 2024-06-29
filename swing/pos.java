import java.awt.*;
import java.awt.event.*;
class demo extends Frame
{
	TextField t1;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(new FlowLayout());
		t1=new TextField(20);
		add(t1);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.out.println("Wnidow Closing...");
				dispose();
			}
		}
		);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosed(WindowEvent we)
			{
				System.out.println("Window Closed");
				dispose();
			}
		}
		);
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				t1.setText("X = "+me.getX()+"  Y = "+me.getY());
			}
		}
		);
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
