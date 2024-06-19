import java.awt.*;
import java.awt.event.*;


class demo extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	Font f1,f2,f3;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setBackground(Color.white);
		setLayout(new FlowLayout());
		
		l1=new Label("Email Registration Form");
		l2=new Label("Enter Email");
		l3=new Label("Enter Password");
		
		f1=new Font("Times New Roman",Font.BOLD,50);
		l1.setFont(f1);
		
		f2=new Font("Times New Roman",Font.BOLD,20);
		l2.setFont(f2);
		
		f3=new Font("Times New Roman",Font.BOLD,20);
		l3.setFont(f3);
		
		t1=new TextField(50);
		t2=new TextField(50);
		t2.setEchoChar('*');
		b1=new Button("Register");
		b2=new Button("Exit");
		
	 
		add(l1);add(l2);add(t1);add(l3);add(t2);
		add(b1);add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{

      char ch;
      String s1=t1.getText();
      String s2=t2.getText();
      int pass=Integer.parseInt(s2);
      for(int i=0;i<s1.length();i++)
	  	{
			  if(((s1.charAt(i)>='a' || s1.charAt(i)<='z') || (s1.charAt(i)>='0' || s1.charAt(i)<='9') || (s1.charAt(i)=='@')) || (s1.charAt(i)=='.')&&pass<=6)
			  {
            t2.setVisible(false);	
            t1.setVisible(false);	
            l2.setVisible(false);
            l1.setVisible(false); 
            b1.setVisible(false);
	          b2.setVisible(false);
	       
	          l1.setText("Register Succesfully");
			  }
			  else
			  { 
			      t2.setVisible(false);	
            t1.setVisible(false);	
            l2.setVisible(false);
            l1.setVisible(false); 
            b1.setVisible(false);
	          b2.setVisible(false);
	          
			       l1.setText("Invalid User Name Or Password");
			  }
			}
      if(ae.getSource()==b2)
      {
        dispose();
      }
    
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
