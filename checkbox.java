import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
	CheckboxGroup cg1,cg2;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		cg1=new CheckboxGroup();
		cg2=new CheckboxGroup();
		c1=new Checkbox("BCS",cg1,false);
		c2=new Checkbox("BCA",cg1,false);
		c3=new Checkbox("BSC",cg1,false);
		c4=new Checkbox("B.COM",cg1,false);
		c5=new Checkbox("BA",cg1,false);
		c6=new Checkbox("MCA",cg2,false);
		c7=new Checkbox("M.COM",cg2,false);
		c8=new Checkbox("MCS",cg2,false);
		c9=new Checkbox("MA",cg2,false);
		c10=new Checkbox("MSC",cg2,false);
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(5,1));
		p1.add(c1);	p1.add(c2);	p1.add(c3);	p1.add(c4);	p1.add(c5);
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(5,1));
		p2.add(c6);p2.add(c7);p2.add(c8);p2.add(c9);p2.add(c10);
		Panel p3=new Panel();
		p3.setLayout(new GridLayout(1,2));
		p3.add(p1);
		p3.add(p2);
		add(p3);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		c7.addItemListener(this);
		c8.addItemListener(this);
		c9.addItemListener(this);
		c10.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(c1.getState()==true)
		c8.setState(true);
		if(c2.getState()==true)
		c6.setState(true);
		if(c3.getState()==true)
		c10.setState(true);
		if(c4.getState()==true)
		c7.setState(true);
		if(c5.getState()==true)
		c9.setState(true);
	}
	public static void main(String ar[])
	{
		new demo();
	}
}
