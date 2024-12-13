package SLIP_4;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
//Q2) Write a program to design a screen using Awt that will take a user name and password. If
//the user name and password are not same, raise an Exception with appropriate message.
//User can have 3 login chances only. Use clear button to clear the TextFields.
class InvalidPasswordException extends Exception
{
	
}
class login extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	char c='*';
	static int count=0;
	login()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Login");
		setLayout(new FlowLayout());
		l1=new Label("User Name");
		t1=new TextField(20);
		l2=new Label("Password");
		t2=new TextField(20);
		t2.setEchoChar(c);
		b1=new Button("Login");
		b2=new Button("clear");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
		try
		{
			if(ae.getSource()==b1)
			{
				String nm=t1.getText();
				String pa=t2.getText();
				if(nm.equals(pa))
				{
					JOptionPane.showInternalMessageDialog(b1, "Login Successfully....");
				}
				else
				{
					throw new InvalidPasswordException();
				}
			}
		}
		catch(Exception e)
		{
			count++;
			JOptionPane.showInternalMessageDialog(null,"Login Fail");
			t1.setText("");
			t2.setText("");
			if(count==3)
			{
				JOptionPane.showInternalMessageDialog(null,"User Can Have Only 3 Attempts");
				dispose();
			}
		}
	}
}
public class Q2 
{

	public static void main(String[] args) 
	{
		login n=new login();

	}

}
