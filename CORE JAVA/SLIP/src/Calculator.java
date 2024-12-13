import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener
{
	TextField t1;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	int ch;
	int a,b,c;
	Calculator()
	{
		setVisible(true);
		setSize(700,700);
		//setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("Simple Calculator");
		
		t1=new TextField(10);
		t1.setBounds(100,50,450,50);
		b1=new Button("1");

		b2=new Button("2");

		b3=new Button("3");
		
		b4=new Button("4");

		b5=new Button("5");

		b6=new Button("6");

		b7=new Button("7");

		b8=new Button("8");

		b9=new Button("9");

		b10=new Button("0");
	
		b11=new Button("+");
	
		b12=new Button("-");
	
		b13=new Button("*");
		
		b14=new Button("/");

		b15=new Button("clear");
	
		b16=new Button("=");
	  Panel p=new Panel();
	  p.setBackground(Color.pink);
	  p.setLayout(new GridLayout(4,4,9,9));
	  p.setBounds(100,120,450,400);
		add(t1);
		p.add(b7);p.add(b8);p.add(b9);p.add(b11);
		p.add(b4);p.add(b5);p.add(b6);p.add(b12);
		p.add(b1);p.add(b2);p.add(b3);p.add(b13);
		p.add(b15);p.add(b10);p.add(b16);p.add(b14);
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
	 
	  try
	  {
	    if(ae.getSource()==b1)
	    {
	        t1.setText(t1.getText()+"1");
	    }
	     if(ae.getSource()==b2)
	    {
	        t1.setText(t1.getText()+"2");
	    }
	     if(ae.getSource()==b3)
	    {
	        t1.setText(t1.getText()+"3");
	    }
	     if(ae.getSource()==b4)
	    {
	        t1.setText(t1.getText()+"4");
	    }
	     if(ae.getSource()==b5)
	    {
	        t1.setText(t1.getText()+"5");
	    }
	     if(ae.getSource()==b6)
	    {
	        t1.setText(t1.getText()+"6");
	    }
       if(ae.getSource()==b7)
	      {
	          t1.setText(t1.getText()+"7");
	      }
	       if(ae.getSource()==b8)
	      {
	          t1.setText(t1.getText()+"8");
	      }
	       if(ae.getSource()==b9)
	      {
	          t1.setText(t1.getText()+"9");
	      }
	       if(ae.getSource()==b10)
	      {
	          t1.setText(t1.getText()+"0");
	    }
	     if(ae.getSource()==b11)
	    {
	         a=Integer.parseInt(t1.getText());
	        ch=1;
	        t1.setText("");
	    }
	     if(ae.getSource()==b12)
	    {
	        a=Integer.parseInt(t1.getText());
	        ch=2;
	      t1.setText("");
	    }
	     if(ae.getSource()==b13)
	    {
	       a=Integer.parseInt(t1.getText());
	        ch=3;
	        t1.setText("");
	    }
	     if(ae.getSource()==b14)
	    {
	         a=Integer.parseInt(t1.getText());
	        ch=4;
	       t1.setText("");
	    }
	     if(ae.getSource()==b15)
	    {
	        t1.setText(" ");
	    }
	     if(ae.getSource()==b16)
	    {
	        b=Integer.parseInt(t1.getText());
	        if(ch==1)
	        {
	            c=a+b;
	            t1.setText(""+a+"+"+b+"="+c);
	        }
	         if(ch==2)
	        {
	            c=a-b;
	           t1.setText(""+a+"-"+b+"="+c);
	        }
	         if(ch==3)
	        {
	            c=a*b;
	            t1.setText(""+a+"*"+b+"="+c);
	        }
	       if(ch==4)
	      {
	          c=a/b;
	         t1.setText(""+a+"/"+b+"="+c);
	      }
	    }
	    }
	    catch(Exception e)
	    {
	        t1.setText("Syntax Error ......!");
	    }
	  
	}
	public static void main(String ar[])
	{
	  new Calculator();
	}
}
