import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements MouseListener
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
		t1.addMouseListener(this);
	}	
	public void mouseClicked(MouseEvent me)
	{
	
		t1.setText("X = "+me.getX()+"  Y = "+me.getY());
	}
	public void mousePressed(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public void mouseEntered(MouseEvent me)
	{
		
	}
	public void mouseExited(MouseEvent me)
	{
		
		dispose();
	}	
	public static void main(String ar[])
	{
		new demo();
	}
}
