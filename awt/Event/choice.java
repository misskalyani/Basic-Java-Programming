import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ItemListener
{
	Choice c1;//Combobox
	TextField t1;
	demo()
	{
		setVisible(true);
		setSize(300,500);
		setLayout(new FlowLayout());
		t1=new TextField(10);
		c1=new Choice();
		c1.add("c");
		c1.add("cpp");
		c1.add("java");
		add(c1);
		add(t1);
		c1.addItemListener(this);
	}
  public void itemStateChanged(ItemEvent ie)
  {
      if(ie.getSource()==c1)
      {
        String s1=c1.getSelectedItem();
        t1.setText(s1);
      }
  }
	
	public static void main(String ar[])
	{
		new demo();
	}
}
