/*b) Design the following screen by using swing.
Student details –  ×
Roll No.
Name
Percentage
Display         Clear
Write a Java program to accept the details of student & display an console by clicking on Display button. 
Clear button should clear all the controls.*/
/*b) Write a java program using swing to accept details of employee (eno,ename, esal) and display it by clicking on a button.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class student extends JFrame implements ActionListener
{
		JLabel l1,l2,l3;
		JTextField t2,t3,t4,t1 ;
		JButton submitButton,clear ;
		student()
		{
			setVisible(true);
			setSize(500,500);
			setTitle("Student details");
			setLayout(new GridLayout(5, 2));
			l1 = new JLabel("Roll No");
			t1 = new JTextField();
			l2 = new JLabel("Name:");
			t2 = new JTextField();
			t3 = new JTextField();
			l3 = new JLabel("Percent:");
			t4= new JTextField();
			submitButton = new JButton("Submit");
			clear=new JButton("Clear");
			add(l1);
		    add(t1);
		    add(l2);
		    add(t2);
		    add(l3);
		    add(t3);
		    add(submitButton);
		    add(clear);
		    add(t4);
		    submitButton.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getSource()==submitButton)
				{
					String No = t1.getText();
					String name = t2.getText();
					String per =t3.getText();
					t4.setText("RollNo: " + No + "\nName: " + name + "\nPercentage: " + per);
				}	
				if(ae.getSource()==clear)
				{
					t1.setText(" ");
					t2.setText(" ");
					t3.setText(" ");
					t4.setText(" ");
				}
		}
}
public class Q12 {

	public static void main(String[] args) {
		student on=new student();
	}

}
