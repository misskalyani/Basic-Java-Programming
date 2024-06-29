import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6;
	JList lst1,lst2;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,200);
		setLayout(null);
		
		l1=new JLabel("All Product");
		l2=new JLabel("Selected Product");
		l3=new JLabel("Enter Product");
		
		t1=new JTextField(15);
		
		b1=new JButton("<");
		b2=new JButton("<<");
		b3=new JButton(">");
		b4=new JButton(">>");
		b5=new JButton("Add");
		b6=new JButton("Remove");
		
		lst1=new JList();
		lst2=new JList();
		
		l1.setBounds(50,50,150,30);
		add(l1);
		l2.setBounds(300,50,150,30);
		add(l2);
		lst1.setBounds(50,100,100,200);
		add(lst1);
		lst2.setBounds(300,100,100,200);
		add(lst2);
		b1.setBounds(200,110,50,20);
		add(b1);
		b2.setBounds(200,160,50,20);
		add(b2);
		b3.setBounds(200,220,50,20);
		add(b3);
		b4.setBounds(200,270,50,20);
		add(b4);
		l3.setBounds(50,350,100,20);
		add(l3);
		t1.setBounds(150,350,150,20);
		add(t1);
		b5.setBounds(150,400,50,20);
		add(b5);
		b6.setBounds(250,400,60,20);
		add(b6);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);		
		b3.addActionListener(this);		
	  b4.addActionListener(this);		
	}
	public void actionPerformed(ActionEvent ae)
	{
	  if(ae.getSource()==b2)
	  {
	      for(int i=0;i<lst1.countItems();i++)
	      {
	          lst2.add(lst1.getSelectedIndex(i));
	      }
	  }  
	  if(ae.getSource()==b1)
	  {
	      lst2.add(lst1.getSelectedItem());
	  }
	  
	  
	   if(ae.getSource()==b4)
	  {
	      for(int i=0;i<lst1.countItems();i++)
	      {
	          lst1.add(lst2.getItem(i));
	      }
	  }  
	  if(ae.getSource()==b3)
	  {
	      lst1.add(lst2.getSelectedItem());
	  }
	  
	  if(ae.getSource()==b5)
	  {
	      lst1.add(t1.getText());
	      t1.setText(" ");
	  }
	  if(ae.getSource()==b6)
	  {
	      //lst2.remove(lst2.getSelectedItem());
	      lst2.remove(lst2.getSelectedIndex());
	  }
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
