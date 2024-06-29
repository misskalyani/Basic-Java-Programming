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
			ImageIcon im=new ImageIcon(logo1.jepg);
			//JOptionPane.showMessageDialog(this,"Message","Title","Messge Type");
		int k=	JOptionPane.showConfirmDialog(this,"Hiiii...","Plane..!",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,im);
			//0=yes,1=no,2=cancle
				//int k=	JOptionPane.showConfirmDialog(this,"Hiiii...","Plane..!",JOptionPane.YES_NO_CANCLE_OPTION,JOptionPane.INFORMATION_MESSAGE,im);
			//0=yes,1=no,2=cancle

			if(k==0)
			{
			  String s1=JOptionPane.showInputDialog("Enter Number");
			int a=Integer.parseInt(s1);
			int b=a*a;
			JOptionPane.showMessageDialog(this,"Square = "+b);
			}
		}
		
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
