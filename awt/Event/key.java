import java.awt.*;
import java.awt.event.*;
class key extends Frame implements KeyListener
{
	TextField t1;
	key()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		t1=new TextField(20);
		add(t1);
		t1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
	  setBackground(Color.pink);
		setTitle("Key Pressed");
	}
	public void keyReleased(KeyEvent ke)
	{
		setTitle("Key Released");
	}
	public void keyTyped(KeyEvent ke)
	{
		setTitle("Key Typed");
	}
	public static void main(String ar[])
	{
	  new key();
	}
}
