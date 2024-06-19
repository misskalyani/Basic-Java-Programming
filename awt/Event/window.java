import java.awt.*;
import java.awt.event.*;
class window extends Frame implements WindowListener
{
	window()
	{
		setVisible(true);
		setSize(300,500);
		addWindowListener(this);
	}
	public void windowOpened(WindowEvent we)
	{
		setTitle("Opened");
	}
	public void windowClosing(WindowEvent we)
	{
		setTitle("Closing");
	}
		public void windowClosed(WindowEvent we)
	{
		setTitle("Closed");
	}
		public void windowIconified(WindowEvent we)
	{
		setTitle("Iconified");
	}
		public void windowDeiconified(WindowEvent we)
	{
		setTitle("Deiconified");
	}
	public void windowActivated(WindowEvent we)
	{
		setTitle("Activited");
	}
	public void windowDeactivated(WindowEvent we)
	{
		setTitle("Deactivited");
	}
	public static void main(String ar[])
	{
		new window();
	}
}
