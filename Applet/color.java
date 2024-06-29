import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class color extends Applet implements ItemListener
{
	Checkbox c1,c2,c3;
	CheckboxGroup cg;
	public void init()
	{
		cg=new checkboxGroup();
		c1=new Checkbox("Red",cg,true);
		c2=new Checkbox("Yellow',cg,false);
		c3=new Checkbox("Blue",cg,false);
		add(c1);add(c2);add(c3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState()==true)
		{
			setBackground(Color.red);
		}
		if(c2.getState()==true)
		{
			setBackground(Color.yellow);
		}
		if(c3.getState()==true)
		{
			setBackground(Color.blue);
		}
	}
}
