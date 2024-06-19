import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	
	demo()
	{
		setVisible(true);
		setSize(200,300);
		setLocation(200,300);
		setLayout(null);
		setTitle("Simple Calculator");
		
		t1=new TextField(100);
		t1.setBounds(100,70,160,30);
		b1=new Button("1");
		b1.setBounds(100,170,40,30);
		b2=new Button("2");
		b2.setBounds(140,170,40,30);
		b3=new Button("3");
		b3.setBounds(180,170,40,30);
		b4=new Button("4");
		b4.setBounds(100,140,40,30);
		b5=new Button("5");
		b5.setBounds(140,140,40,30);
		b6=new Button("6");
		b6.setBounds(180,140,40,30);
		b7=new Button("7");
		b7.setBounds(100,110,40,30);
		b8=new Button("8");
		b8.setBounds(140,110,40,30);
		b9=new Button("9");
		b9.setBounds(180,110,40,30);
		b10=new Button("0");
		b10.setBounds(140,200,40,30);
		b11=new Button("+");
		b11.setBounds(220,110,40,30);
		b12=new Button("-");
		b12.setBounds(220,140,40,30);
		b13=new Button("*");
		b13.setBounds(220,200,40,30);
		b14=new Button("/");
		b14.setBounds(220,170,40,30);
		b15=new Button("clear");
		b15.setBounds(100,200,40,30);
		b16=new Button("=");
		b16.setBounds(180,200,40,30);
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

