package SLIP19;
//Q2) Write a program which shows the combo box which includes list of T.Y.B.Sc.(Comp. Sci)
//subjects. Display the selected subject in a text field.
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Q2 extends JFrame implements ActionListener
{
	JComboBox cb;
	JTextField t1;
	JLabel l;
	JButton b;
	Q2()
	{
		setVisible(true);
		setSize(500,600);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l=new JLabel("Languages");
		t1=new JTextField(20);
		b=new JButton("show");
		
		String lang[]= {"c","python","java","php"};
		cb=new JComboBox(lang);
		add(cb);
		add(l);
	
		add(b);
		add(t1);
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String data=""+cb.getSelectedItem();
		t1.setText(data);
	}
	public static void main(String[] args) 
	{
		new Q2();
	}

}
