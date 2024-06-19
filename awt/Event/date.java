import java.awt.*;
import java.awt.event.*;
import java.util.*;
class demo extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1;
	Button b1;
	demo()
	{
		setVisible(true);
		setSize(100,100);
		setLayout(new GridLayout(5,1));
		
		l1=new Label("Enter User ");
		l2=new Label("Greet Message");
		l3=new Label("Date & Time");
		t1=new TextField(10);
		add(l1);add(t1);
		add(l2);add(l3);
		b1=new Button("Ok");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			Date d1=new Date();
			int hr=d1.getHours();
			if (hr>=12 &&hr<=17)
				l2.setText("Greet Message : Good Afternoon "+s1);
			else if(hr>=17 &&hr<=20)
				l2.setText("Greet Message : Good Evening "+s1);
			else if(hr>=20 &&hr<=24)
				l2.setText("Greet Message : Good Afternoon "+s1);
			else
				l2.setText("Greet Message : Good Morning "+s1);	
				
				l3.setText("Date & Time : "+d1);
		}
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
