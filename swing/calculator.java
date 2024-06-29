import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener
{
  float a,b,c;
  int ch;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(new FlowLayout());
		setTitle("Simple Calculator");
		
		t1=new JTextField(20);
		
		b1=new JButton("1");
		
		b2=new JButton("2");
		
		b3=new JButton("3");
		
		b4=new JButton("4");
		
		b5=new JButton("5");
		
		b6=new JButton("6");
		
		b7=new JButton("7");
		
		b8=new JButton("8");
		
		b9=new JButton("9");
		
		b10=new JButton("0");
		
		b11=new JButton("+");
	
		b12=new JButton("-");
	
		b13=new JButton("*");
		
		b14=new JButton("/");
		
		b15=new JButton("C");
	
		b16=new JButton("=");
		Panel p=new Panel();
		p.setBackground(Color.pink);
		p.setLayout(new GridLayout(4,4,10,10));
		add(t1);
		p.add(b7);p.add(b8);p.add(b9);p.add(b11);
		p.add(b4);p.add(b5);p.add(b6);p.add(b12);
		p.add(b1);p.add(b2);p.add(b3);p.add(b13);
		p.add(b10);p.add(b14);p.add(b15);p.add(b16);
	
		add(p);
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


