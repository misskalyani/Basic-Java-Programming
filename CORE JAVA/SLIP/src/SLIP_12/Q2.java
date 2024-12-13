package SLIP_12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Q2) Write a java program that works as a simple calculator. Use a grid layout to arrange buttons for
//the digits and for the +, -, *, % operations. Add a text field to display the result.
class cal extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bdiv,beql,bmul,bsub,bzero,bdec;
	double a,b,result=0;
	static int operator=0;
	cal()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		t1=new JTextField(20);
		t1.setBounds(90,100,250,50);
		add(t1);
		b1=new JButton("1");
		b1.setBounds(100,150,50,50);
		add(b1);
		b2=new JButton("2");
		b2.setBounds(160,150,50,50);
		add(b2);
		b3=new JButton("3");
		b3.setBounds(220,150,50,50);
		add(b3);
		badd=new JButton("+");
		badd.setBounds(280,150,50,50);
		add(badd);
		
		b4=new JButton("4");
		b4.setBounds(100,200,50,50);
		add(b4);
		b5=new JButton("5");
		b5.setBounds(160,200,50,50);
		add(b5);
		b6=new JButton("6");
		b6.setBounds(220,200,50,50);
		add(b6);
		bsub=new JButton("-");
		bsub.setBounds(280,200,50,50);
		add(bsub);
		
		b7=new JButton("7");
		b7.setBounds(100,250,50,50);
		add(b7);
		b8=new JButton("8");
		b8.setBounds(160,250,50,50);
		add(b8);
		b9=new JButton("9");
		b9.setBounds(220,250,50,50);
		add(b9);
		bmul=new JButton("*");
		bmul.setBounds(280,250,50,50);
		add(bmul);
		
		bzero=new JButton("0");
		bzero.setBounds(100,300,50,50);
		add(bzero);
		bdec=new JButton(".");
		bdec.setBounds(160,300,50,50);
		add(bdec);
		beql=new JButton("=");
		beql.setBounds(220,300,50,50);
		add(beql);
		bdiv=new JButton("/");
		bdiv.setBounds(280,300,50,50);
		add(bdiv);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		badd.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		bsub.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bmul.addActionListener(this);
		bzero.addActionListener(this);
		bdec.addActionListener(this);
		beql.addActionListener(this);
		bdiv.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText(t1.getText()+("1"));
		}
		if(ae.getSource()==b2)
		{
			t1.setText(t1.getText()+("2"));
		}
		if(ae.getSource()==b3)
		{
			t1.setText(t1.getText()+("3"));
		}
		if(ae.getSource()==b4)
		{
			t1.setText(t1.getText()+("4"));
		}
		if(ae.getSource()==b5)
		{
			t1.setText(t1.getText()+("5"));
		}
		if(ae.getSource()==b6)
		{
			t1.setText(t1.getText()+("6"));
		}
		if(ae.getSource()==b7)
		{
			t1.setText(t1.getText()+("7"));
		}
		if(ae.getSource()==b8)
		{
			t1.setText(t1.getText()+("8"));
		}
		if(ae.getSource()==b9)
		{
			t1.setText(t1.getText()+("9"));
		}
		if(ae.getSource()==bzero)
		{
			t1.setText(t1.getText()+("0"));
		}
		if(ae.getSource()==bdec)
		{
			t1.setText(t1.getText()+("."));
		}
		if(ae.getSource()==badd)
		{
			a=Double.parseDouble(t1.getText());
			t1.setText("");
			operator=1;
		}
		if(ae.getSource()==bsub)
		{
			a=Double.parseDouble(t1.getText());
			t1.setText("");
			operator=2;
		}
		if(ae.getSource()==bmul)
		{
			a=Double.parseDouble(t1.getText());
			t1.setText("");
			operator=3;
		}
		if(ae.getSource()==bdiv)
		{
			a=Double.parseDouble(t1.getText());
			t1.setText("");
			operator=4;
		}
		if(ae.getSource()==beql)
		{
			b=Double.parseDouble(t1.getText());
			switch(operator)
			{
				case 1:result=a+b;
					   break;
				case 2:result=a-b;
					   break;
				case 3:result=a*b;
					   break;
				case 4:result=a/b;
					   break;
			}
			t1.setText(""+result);
		}
	}
}
public class Q2 
{
	
	public static void main(String[] args) 
	{
		cal ob=new cal();
	}

}
