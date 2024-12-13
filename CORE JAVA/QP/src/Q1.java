//a) Write a Java program using AWT to change background color of table to 'RED' by clicking on button.

import java.awt.*;
import java.awt.event.*;

class TableColor extends Frame implements ActionListener
{
	Panel panel ;
	Button button;
	TableColor()
	{
		button = new Button("Change Color");
		panel = new Panel();
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		
		add(button);
		add(panel);
		
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==button)
		{	
			panel.setBackground(Color.RED);
		}
	}
	
}

public class Q1 {


		public static void main(String[] args) 
	  	{
	    	   TableColor t= new TableColor(); 
	  	}

	

}
