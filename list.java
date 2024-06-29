import java.awt.*;
import java.awt.event.*;
import java.io.*;
class demo extends Frame implements ActionListener
{
	TextField t1;
	Label l1,l2;
	Button b1;
	List lst;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		l1=new Label("Enter Directory");
		l2=new Label("All Files");
		t1=new TextField(10);
		lst=new List(10);
		b1=new Button("OK");
		add(l1);add(t1);add(l2);add(lst);add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			lst.clear();
			String s1=t1.getText();
			File f1=new File(s1);
			if(f1.exists())
			{
				String s2[]=f1.list();
				for(int i=0;i<s2.length;i++)
				{
					lst.add(s2[i]);
				}
			}
			else
			{
				t1.setText("Directory Not Found");
			}
		}
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
