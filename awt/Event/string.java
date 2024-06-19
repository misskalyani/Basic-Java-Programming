import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2,b3;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(new FlowLayout());
		
		l1=new Label("Enter First String");
		l2=new Label("Resultant String");
		
		t1=new TextField(20);
		t2=new TextField(20);
		
		
		b1=new Button("LowerCase");
		b2=new Button("UpperCase");
		b3=new Button("Length");
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			String s1=t1.getText();
			String s2=s1.toUpperCase();
			t2.setText(s2);
		}
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=s1.toLowerCase();
			t2.setText(s2);
		}
		if(ae.getSource()==b3)
		{
			String s1=t1.getText();
			int s2=s1.length();
			t2.setText(""+s2);
		}
	}
	public static void main(String ar[])
	{
	  new demo();
	}
}
