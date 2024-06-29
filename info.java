import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7;
	TextField t1,t2,t3,t4,t5;
	Button b1,b2;
	Checkbox c1,c2,c3,c4,c5;
	CheckboxGroup cg;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(null);
		l1=new Label("First Name");
		l1.setBounds(100,100,100,30);
		l2=new Label("Last Name");
		l2.setBounds(100,150,100,30);
		l3=new Label("Personal Information");
		l3.setBounds(200,50,150,30);
		l4=new Label("Address");
		l4.setBounds(100,200,100,30);
		l5=new Label("Mobile Number");
		l5.setBounds(100,250,100,30);
		l6=new Label("Gender");
		l6.setBounds(100,300,50,30);
		cg =new CheckboxGroup();
		c1=new Checkbox("Male",cg,false);
		c1.setBounds(200,300,50,30);
		c2=new Checkbox("Female",cg,false);
		c2.setBounds(200,350,50,30);
		l7=new Label("Your Intrest");
		l7.setBounds(100,400,100,30);
		c3=new Checkbox("Computer");
		c3.setBounds(200,400,100,30);
		c4=new Checkbox("Sports");
		c4.setBounds(200,450,100,30);
		c5=new Checkbox("Music");
		c5.setBounds(200,500,100,30);
		b1=new Button("Submit");
		b1.setBounds(200,600,100,30);
		b2=new Button("Reset");
		b2.setBounds(300,600,100,30);
		t1=new TextField(10);
		t1.setBounds(200,100,100,30);
		t2=new TextField(10);
		t2.setBounds(200,150,100,30);
		t3=new TextField(10);
		t3.setBounds(200,200,100,30);
		t4=new TextField(10);
		t4.setBounds(200,250,100,30);
		add(l3);
		add(l1);add(t1);add(l2);add(t2);
		add(l4);add(t3);add(l5);add(t4);
		add(l6);add(c1);add(c2);
		add(l7);add(c3);add(c4);add(c5);
		add(b1);add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
		      
		}
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			
		}
	}
	public static void main(String ar[])
	{
	    new demo();
	}
}
