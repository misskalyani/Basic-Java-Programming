package SLIP_8;
import java.awt.*;
import java.awt.event.*;
//Q2) Design a screen to handle the Mouse Events such as MOUSE_MOVED
//and MOUSE_CLICKED and display the position of the Mouse_Click in a TextField.
class mouse extends Frame implements MouseListener
{
	TextField t1;
	mouse()
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
}
public class Q2 
{
	public static void main(String[] args) 
	{
		mouse ob=new mouse();

	}

}
