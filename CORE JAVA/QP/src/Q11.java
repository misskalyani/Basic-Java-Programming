/*b) Write a java program using swing to accept the details of project (PID, PName, duration) from user and 
 display it by clicking on a button.
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ProjectDetails extends JFrame implements ActionListener
{
		JLabel pidLabel,pnameLabel,durationLabel;
		JTextField pidField,pnameField,durationField,t1 ;
		JButton submitButton ;
		ProjectDetails()
		{
			setVisible(true);
			setSize(500,500);
			setLayout(new GridLayout(4, 2));
			pidLabel = new JLabel("PID:");
			pidField = new JTextField();
			pnameLabel = new JLabel("PName:");
			pnameField = new JTextField();
			t1 = new JTextField();
			durationLabel = new JLabel("Duration:");
			durationField = new JTextField();
			submitButton = new JButton("Submit");
			add(pidLabel);
		    add(pidField);
		    add(pnameLabel);
		    add(pnameField);
		    add(durationLabel);
		    add(durationField);
		    add(submitButton);
		    add(t1);
		    submitButton.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getSource()==submitButton)
				{
					String pid = pidField.getText();
					String pname = pnameField.getText();
					String duration = durationField.getText();
					t1.setText("PID: " + pid + "\nPName: " + pname + "\nDuration: " + duration);
				}	
		}
}
public class Q11 {

	public static void main(String[] args) {
		ProjectDetails p= new ProjectDetails();

	}

}
