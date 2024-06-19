import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	List lst;
	Button b1,b2;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(300,600);
		setTitle("Tabels");
		setLayout(new FlowLayout());
		
		l1=new Label("Enter Number");
		l2=new Label("Tabel");
		
		t1=new TextField(10);
		lst=new List(10);
		
		b1=new Button("ok");
		b2=new Button("clear");
		
		add(l1);add(t1);add(l2);add(lst);add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			int a=Integer.parseInt(s1);
			for(int i=1;i<=10;i++)
				lst.add(""+a*i);
		}
		if(ae.getSource()==b2)
		{
			lst.clear();
		}
	}
	public static void main(String a[])
	{
		demo ob=new demo();
	}
}
