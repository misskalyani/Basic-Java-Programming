
import java.awt.*;
import java.awt.event.*;
class twoframe extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1;
	twoframe()
	{
		setVisible(true);
		setSize(600,500);
		setLayout(new FlowLayout());
		l1=new Label("Enter Eno");
		l2=new Label("Enter Name");
		l3=new Label("Enter Salary");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("Submit");
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int no=Integer.parseInt(t1.getText());
			String name=t2.getText();
			int sal=Integer.parseInt(t3.getText());
			demo ob=new demo(no,name,sal);
		}
	}
	public static void main(String ar[])
	{
		twoframe ob= new twoframe();
	}
}
class demo extends Frame 
{
	Label l1,l2,l3;
	demo(int eno,String enm,int sal )
	{
		setVisible(true);
		setSize(200,100);
		setLocation(500,100);
		setLayout(new FlowLayout());
		l1=new Label("Eno : "+eno);
		l2=new Label("Ename : "+enm);
		l3=new Label("Salary : "+sal);
		add(l1);add(l2);add(l3);
	}
}
