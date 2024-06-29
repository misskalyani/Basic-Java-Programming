import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setLayout(new FlowLayout());
		
		l1=new JLabel("Enter Number");
		add(l1);
		t1=new JTextField(10);
		add(t1);
		b1=new JButton("OK");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ar)
	{
		if(ar.getSource()==b1)
		{
			int n=Integer.parseInt(t1.getText());
			if(n%2==0)
			JOptionPane.showMessageDialog(this,"Number is Even");
			else
			JOptionPane.showMessageDialog(this,"Number is Odd");
		}
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
