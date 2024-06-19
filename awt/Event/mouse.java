import java.awt.*;
import java.awt.event.*;
class mouse extends Frame implements MouseListener
{
	TextField t1;
	mouse()
	{
		setVisible(true);
		setSize(300,500);
		setLayout(new FlowLayout());
		t1=new TextField(20);
		add(t1);
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		t1.setText("Mouse Clicked");
	}
	public void mousePressed(MouseEvent me)
	{
		t1.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent me)
	{
		t1.setText("Mouse Released");
	}
	public void mouseEntered(MouseEvent me)
	{
		t1.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent me)
	{
		t1.setText("Mouse Exited");
		//dispose();
	}
	public static void main(String ar[])
	{
		new mouse();
	}
}
