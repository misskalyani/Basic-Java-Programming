import java.awt.*;
class demo extends Frame
{
	Label l1;
	Checkbox c1,c2;
	CheckboxGroup cg;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(200,400);
		setBackground(Color.gray);
		setLayout(new FlowLayout());
		
		l1=new Label("Select Gender");
		cg=new CheckboxGroup();
		c1=new Checkbox("Male",cg,false);
		c2=new Checkbox("Female",cg,true);
		
		add(l1);add(c1);add(c2);
	}
	public static void main(String ar[])
	{
		demo ob=new demo();
	}
}
