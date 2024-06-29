import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6;
	demo()
	{
		setVisible(true);
		setSize(50,500);
		setLocation(100,300);
		setBackground(Color.pink);
		setTitle("Arithmetic Operation");
		setLayout(new GridLayout(5,2));
		l1=new JLabel("Enter First Number");
		l2=new JLabel("Enter Second Number");
		l3=new JLabel("Result");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		b1=new JButton("Add");
		b2=new JButton("Sub");
		b3=new JButton("Clear");
		b4=new JButton("Exit");
		
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			int a=Integer.parseInt(s1);
			int b=Integer.parseInt(s2);
			int c=a+b;
			t3.setText(""+c);
		}
		if(ae.getSource()==b2)
		{
		  String s1=t1.getText();
		  String s2=t2.getText();
		  int a=Integer.parseInt(s1);
		  int b=Integer.parseInt(s2);
		  int c=a-b;
		  t3.setText(""+c);
		}
		if(ae.getSource()==b3)
		{
		    t1.setText("");
		    t2.setText("");
		    t3.setText("");
		}
		if(ae.getSource()==b4)
		{
		    dispose();
		}
	}
}
class md
{
	public static void main(String ar[])
	{
		demo ob=new demo();
	}
}
