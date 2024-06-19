import java.awt.*;
import java.awt.event.*;
class demo1 extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	demo1()
	{
		setVisible(true);
		setSize(400,500);
		setLocation(100,300);
		setBackground(Color.pink);
		setLayout(new GridLayout(3,2,20,50));
		
		l1=new Label("Enter User Name");
		l2=new Label("Message");
		
		t1=new TextField(10);
		t2=new TextField(10);
		
		b1=new Button("Ok");
		b2=new Button("Exit");
		
		add(l1);add(t1);add(l2);add(t2);add(b1);add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
			if(ae.getSource()==b1)
			{
				String s1=t1.getText();
				String s2=s1.toUpperCase();
				t2.setText("Hello ,"+s2+" nice to meet you");
			}
			if(ae.getSource()==b2)
			{
				dispose();
			}
	}	

}
class md
{
	public static void main(String ar[])
	{
		demo1 ob=new demo1();
	}
}

