import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(null);
		setTitle("Simple Calculator");
		
		t1=new JTextField(100);
		t1.setBounds(100,70,165,30);
		b1=new JButton("1");
		b1.setBounds(100,170,45,30);
		b2=new JButton("2");
		b2.setBounds(140,170,45,30);
		b3=new JButton("3");
		b3.setBounds(180,170,45,30);
		b4=new JButton("4");
		b4.setBounds(100,140,45,30);
		b5=new JButton("5");
		b5.setBounds(140,140,45,30);
		b6=new JButton("6");
		b6.setBounds(180,140,45,30);
		b7=new JButton("7");
		b7.setBounds(100,110,45,30);
		b8=new JButton("8");
		b8.setBounds(140,110,45,30);
		b9=new JButton("9");
		b9.setBounds(180,110,45,30);
		b10=new JButton("0");
		b10.setBounds(140,200,45,30);
		b11=new JButton("+");
		b11.setBounds(220,110,45,30);
		b12=new JButton("-");
		b12.setBounds(220,140,45,30);
		b13=new JButton("*");
		b13.setBounds(220,200,45,30);
		b14=new JButton("/");
		b14.setBounds(220,170,45,30);
		b15=new JButton("C");
		b15.setBounds(100,200,45,30);
		b16=new JButton("=");
		b16.setBounds(180,200,45,30);
		add(t1);
		add(b7);add(b8);add(b9);add(b11);
		add(b4);add(b5);add(b6);add(b12);
		add(b1);add(b2);add(b3);add(b13);
		add(b10);add(b14);add(b15);add(b16);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);	
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);	
	}

	public void actionPerformed(ActionEvent ae)
	{
	 
	  if(ae.getSource()==b1)
	  {
	      t1.setText("1");
	  }
	   if(ae.getSource()==b2)
	  {
	      t1.setText("2");
	  }
	   if(ae.getSource()==b3)
	  {
	      t1.setText("3");
	  }
	   if(ae.getSource()==b4)
	  {
	      t1.setText("4");
	  }
	   if(ae.getSource()==b5)
	  {
	      t1.setText("5");
	  }
	   if(ae.getSource()==b6)
	  {
	      t1.setText("6");
	  }
   if(ae.getSource()==b7)
	  {
	      t1.setText("7");
	  }
	   if(ae.getSource()==b8)
	  {
	      t1.setText("8");
	  }
	   if(ae.getSource()==b9)
	  {
	      t1.setText("9");
	  }
	   if(ae.getSource()==b10)
	  {
	      t1.setText("0");
	  }
	   if(ae.getSource()==b11)
	  {
	    
	      t1.setText("+");
	  }
	   if(ae.getSource()==b12)
	  {
	      t1.setText("-");
	  }
	   if(ae.getSource()==b13)
	  {
	      t1.setText("*");
	  }
	   if(ae.getSource()==b14)
	  {
	      t1.setText("/");
	  }
	   if(ae.getSource()==b15)
	  {
	      t1.setText(" ");
	  }
	   if(ae.getSource()==b16)
	  {
	      t1.setText("=");
	  }
	}
	public static void main(String ar[])
	{
	  new demo();
	}
}


