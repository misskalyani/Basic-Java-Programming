import java.awt.*;

class demo extends Frame 
{
	Label l1;
	Checkbox c1,c2,c3,c4,c5;
	Button b1;
	demo()
	{
		setVisible(true);
		setSize(500,500);
		setTitle("Subject");
		setLocation(500,300);
		setBackground(Color.white);
		setLayout(new GridLayout(7,1));
		
		l1=new Label("Select Subject");
		c1=new Checkbox("Java");
		c2=new Checkbox("PHP");
		c3=new Checkbox("Python");
		c4=new Checkbox("TCS");
		c5=new Checkbox("DS");
		
		b1=new Button("Submit");
		
		add(l1);add(c1);add(c2);add(c3);add(c4);add(c5);add(b1);
	
		}
}
class md
{
	public static void main(String ar[])
	{
		demo ob=new demo();
	}
}
