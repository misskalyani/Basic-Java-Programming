import java.awt.*;
class demo extends Frame
{
	Label l1;
	demo()
	{
		setVisible(true);
		setSize(300,500);
		setTitle("demo");
		setLocation(200,100);
		setBackground(Color.red);
		
		l1=new Label("Hello World");
		Font f= new Font("Times New Roman",Font.BOLD,20);
		l1.setFont(f);
		//l1.setBackground(Color.yellow);
		l1.setForeground(Color.blue);
		add(l1);
}
	public static void main(String ar[])
	{
		demo ob =new demo();
	}
}
