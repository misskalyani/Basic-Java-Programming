import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	static int cnt=0;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	demo()
	{
		setVisible(true);
		setSize(500,300);
		setLayout(new FlowLayout());
		l1=new Label("User Name");
		l2=new Label("Password");
		l3=new Label("Result");
		
		t1=new TextField(20);
		t2=new TextField(20);
	//	t2.setEchoChar('*');
		t3=new TextField(20);
		
		b1=new Button("Login");
		b2=new Button("Clear");
		
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
		  if(ae.getSource()==b1)
		  {
			  String s1=t1.getText();
			  String s2=t2.getText();
			  
			  if(s1.equals(s2))
			  {
				  t3.setText("Login Successfully...");
			  }
			}  
			if(ae.getSource()==b2)
			{
			  t1.setText("");
			  t2.setText("");
			  t3.setText("");
			}
		
	}
	public static void main(String a[])
	{
		demo ob=new demo();
	}
}
