import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class demo extends JFrame implements ActionListener
{
	JLabel j1;
	JButton b1;
	JTextField t1;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		j1=new JLabel("Enter Number ");
		add(j1);
		t1=new JTextField(10);
		add(t1);
		b1=new JButton("OK");
		add(b1);
	
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)	
	{
		if(ae.getSource()==b1)
		{
			String s1=JOptionPane.showInputDialog("Enter Number");
			int a=Integer.parseInt(s1);
			int b=a*a;
			JOptionPane.showMessageDialog(this,"Square = "+b);
		}
		
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
