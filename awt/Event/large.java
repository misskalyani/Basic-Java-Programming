import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(new FlowLayout());
		
		l1=new Label("Enter First Number");
		l2=new Label("Enter Second Number");
		l3=new Label("Enter Third Number");
		l4=new Label("Largest Number");
		
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		
		b1=new Button("OK");
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int a=Integer.parseInt(t1.getText());
			int b=Integer.parseInt(t2.getText());
			int c=Integer.parseInt(t3.getText());
			if(a<b && c<b)
			t4.setText(""+b);
			else if(b<a && c<a)
			t4.setText(""+a);
			else
			t4.setText(""+c);
		}
	}
	public static void main(String ar[])
	{
	  new demo();
	}
}
