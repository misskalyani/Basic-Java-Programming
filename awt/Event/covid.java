import java.awt.*;
class demo extends Frame
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4;
	Font f1;
	Checkbox c1,c2,c3,c4,c5,c6,c7,c8;
	CheckboxGroup cg,cg1,cg2;
	Button b1;
	demo()
	{
		setVisible(true);
		setSize(500,800);
		setLocation(100,200);
		setLayout(null);
		
		l1=new Label("Co-WIN Regestration");
		f1=new Font("Times New Roman",Font.BOLD,20);
		l1.setFont(f1);
		l1.setBounds(200,10,150,30);
		l2=new Label("Adhar Card Number");
		l2.setBounds(100,100,150,30);
		l3=new Label("Birth Year");
		l3.setBounds(100,150,150,30);
		l4=new Label("Mobile Number");
		l4.setBounds(100,200,150,30);
		l5=new Label("Age Group");
		l5.setBounds(100,250,100,30);
		l6=new Label("Select Hospital");
		l6.setBounds(100,350,150,30);
		l7=new Label("Vaccancies");
		l7.setBounds(100,400,150,30);
		l8=new Label("Time Slot");
		l8.setBounds(100,550,150,30);
		
		t1=new TextField(10);
		t1.setBounds(250,100,150,30);
		t2=new TextField(10);
		t2.setBounds(250,150,150,30);
		t3=new TextField(10);
		t3.setBounds(250,200,150,30);
		t4=new TextField(10);
		t4.setBounds(250,350,150,30);
		
		cg=new CheckboxGroup();
		cg1=new CheckboxGroup();
		cg2=new CheckboxGroup();
		c1=new Checkbox("18 & above",cg,false);
		c1.setBounds(250,250,200,30);
		c2=new Checkbox("45 & above",cg,true);
		c2.setBounds(250,300,200,30);
		c3=new Checkbox("Covishield",cg1,true);
		c3.setBounds(250,400,150,30);
		c4=new Checkbox("Covaxin",cg1,false);
		c4.setBounds(250,450,150,30);
		c5=new Checkbox("Sputnik V ",cg1,false);
		c5.setBounds(250,500,150,30);
		c6=new Checkbox("Morning",cg2,true);
		c6.setBounds(250,550,150,30);
		c7=new Checkbox("Afternoon",cg2,false);
		c7.setBounds(250,600,150,30);
		c8=new Checkbox("Evening",cg2,false);
		c8.setBounds(250,650,150,30);
		
		b1=new Button("Submit");
		b1.setBounds(200,750,50,30);
		//b1.Background(Color.black);
		add(l1);add(l2);add(t1);add(l3);add(t2);add(l4);add(t3);add(l5);add(c1);add(c2);
		add(l6);add(t4);add(l7);add(c3);add(c4);add(c5);add(b1);
		add(l8);add(c6);add(c7);add(c8);
	}
	public static void main(String arg[])
	{
	  new demo();
	}
}

