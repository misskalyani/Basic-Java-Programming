import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Addition extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	public void init()
	{
		l1=new Label("Enter First No");
		l2=new Label("Enter Second No");
		l3=new Label("Display Result");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("ADD");
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);
	b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getSource()==b1)
	    {
	        int a=Integer.parseInt(t1.getText());
	        int b=Integer.parseInt(t1.getText());
	        int c=a+b;
	    }
	}
}
