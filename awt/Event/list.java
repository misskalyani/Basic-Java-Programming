import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1;
	Button b1,b2;
	List lst;
	demo()
	{
		setVisible(true);
		setSize(300,500);
		setLocation(200,400);
		setTitle("Product");
		setLayout(new GridLayout(3,2,20,50));
		
		l1=new Label("Enter Product");
		l2=new Label("All Product");
		
		t1=new TextField(10);
		lst=new List(100);
		
		b1=new Button("Add");
		b2=new Button("Remove");
		
		add(l1);add(t1);add(l2);add(lst);add(b1);add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ob)
	{
	  if(ob.getSource()==b1)
	  {
	    String a=t1.getText();
	    lst.add(a);
	  }
	  if(ob.getSource()==b2)
	  {
	    lst.remove(lst.getSelectedItem());
	  }
	}
	public static void main(String s1[])
	{
	  demo ob=new demo();
	}
}
