import java.awt.event.*;
import java.awt.*;
import java.applet.*;
public class cardemo extends Applet
{	
	int x,y,w,z,a,w1;
	void slep()
	{
		try
		{
			Thread.sleep(200);
		}
		catch(Exception ob)
		{}
	}
	void slep1()
	{
		try
		{
			Thread.sleep(300);
		}
		catch(Exception ob)
		{}
	}

	public void init()
	{
		x=20;
		y=800;
		z=650;
		a=30;
	}
	public void paint(Graphics g)
	{	
		Color c=new Color(30,170,250);
		Color c1=new Color(128,127,73);
		Color c2=new Color(200,60,200);
		Color c3=new Color(210,100,20);
		Color c4=new Color(250,70,210);
		Color c10=new Color(194,192,65);
		Color c11=new Color(219,48,34);

			setBackground(c);
		
		Color c9=new Color(10,100,50);//grren
		g.setColor(Color.white);
		g.fillOval(100,100,100,100);//1		
		g.fillOval(100,80,80,80);//2		
		g.fillOval(80,110,80,80);//3		
		g.fillOval(90,150,80,80);//4		
		g.fillOval(130,160,80,80);//5		
		g.fillOval(150,140,80,80);//6		
		g.fillOval(150,100,80,80);//7		
		g.fillOval(1000,100,100,100);//1		
		g.fillOval(1000,80,80,80);//2		
		g.fillOval(970,110,80,80);//3		
		g.fillOval(1050,150,80,80);//4		
		g.fillOval(1000,160,80,80);//5		
		g.fillOval(1000,140,80,80);//6		
		g.fillOval(1050,100,80,80);//7		
		g.fillOval(1500,100,100,100);//1		
		g.fillOval(1500,80,80,80);//2		
		g.fillOval(1470,110,80,80);//3		
		g.fillOval(1550,150,80,80);//4		
		g.fillOval(1500,160,80,80);//5		
		g.fillOval(1500,140,80,80);//6		
		g.fillOval(1550,100,80,80);//7		

		//green
		g.setColor(c9);
		g.fillArc(0,400,300,200,5,175);//1
		g.fillArc(300,400,300,200,5,170);//2
		g.fillArc(600,400,300,200,8,170);//3
		g.fillArc(895,390,300,200,8,170);//4	
		g.fillArc(1190,390,300,200,8,170);//5
		g.fillArc(1485,390,300,200,8,170);//6
		g.fillArc(1780,390,300,200,30,150);//7

		g.fillRect(0,500,2000,200);
		g.fillRect(100,490,2000,50);
		g.fillRect(500,480,2000,20);
		g.fillRect(895,470,1190,20);
		Color c5=new Color(20,100,100);
		Color c6=new Color(199,198,113);
		Color c7=new Color(100,100,150);
		Color c8=new Color(166,93,76);//Brown
		Color c12=new Color(76,164,166);
		Color c13=new Color(146,50,65);
		//Home
		g.setColor(c1);
		Color c14=new Color(115,251,253);
		Color c15=new Color(134,134,134);
		Color c16=new Color(66,66,66);


		g.fillRect(600,350,150,150);
		g.setColor(c6);
		g.fillRect(690,400,30,80);
		g.setColor(c15);
		g.fillRect(600,480,150,20);
		
		g.setColor(c14);
		g.fillRect(660,370,80,110);
		g.setColor(c16);
		g.fillRect(680,400,40,80);
		g.setColor(c6);
		g.fillRect(640,420,20,60);
		g.setColor(c15);
		g.fillRect(590,315,170,40);
		g.setColor(c8);	
		g.drawLine(700,300,660,370);
		g.drawLine(700,300,740,370);
		g.fillRect(690,320,20,50);
		g.fillRect(672,350,58,20);
		g.fillRect(698,300,4,4);
		g.fillRect(697,304,6,6);
		g.fillRect(695,308,10,15);
		g.fillRect(693,313,10,10);
		g.fillRect(705,315,5,5);
		g.fillRect(705,311,2,4);
		g.fillRect(691,320,10,10);
		g.fillRect(690,320,10,10);
		g.fillRect(710,326,6,20);
		g.fillRect(710,329,8,40);
		g.fillRect(710,322,4,40);
		g.fillRect(717,330,2,40);
		g.fillRect(719,335,3,20);
		g.fillRect(722,340,3,20);
		g.fillRect(723,342,3,20);
		g.fillRect(726,350,4,15);
		g.fillRect(728,354,4,15);
		g.fillRect(731,358,4,12);
		g.fillRect(734,360,4,10);
		g.fillRect(680,331,5,30);
		g.fillRect(685,329,5,30);
		g.fillRect(686,320,5,30);
		g.fillRect(675,340,5,30);
		g.fillRect(670,350,5,20);
		g.fillRect(665,358,5,13);
		g.fillRect(661,365,4,7);



		//Balloon
		g.drawRect(610,280,50,35);
		g.setColor(c13);
		g.fillOval(550,60,200,150);//x y w h
		g.setColor(Color.black);
		g.drawLine(640,280,610,205);
		g.drawLine(640,280,650,210);
		g.drawLine(640,280,620,205);
		g.drawLine(640,280,640,210);
		g.drawLine(640,280,630,210);
		g.drawLine(640,280,650,210);
		g.drawLine(640,280,660,210);
		g.drawLine(640,280,670,205);
		g.drawLine(640,280,680,205);
		
		g.setColor(c10);//Sun
		g.fillOval(1150,250,100,100);
		//Road
		g.setColor(Color.black);
		g.fillRect(0,700,4000,700);
		//Road divide
		g.setColor(Color.white);

		g.fillRect(50,800,60,10);
		g.fillRect(150,800,60,10);
		g.fillRect(250,800,60,10);
		g.fillRect(350,800,60,10);
		g.fillRect(450,800,60,10);
		g.fillRect(550,800,60,10);
		g.fillRect(650,800,60,10);
		g.fillRect(750,800,60,10);
		g.fillRect(850,800,60,10);
		g.fillRect(950,800,60,10);
		g.fillRect(1050,800,60,10);
		g.fillRect(1150,800,60,10);
		g.fillRect(1250,800,60,10);
		g.fillRect(1350,800,60,10);
		g.fillRect(1450,800,60,10);
		g.fillRect(1550,800,60,10);
		g.fillRect(1650,800,60,10);
		

		g.fillRect(1750,800,60,10);
		g.fillRect(1850,800,60,10);

		
		//car2
		w1=getWidth();
			  // Draw car body
       		g.setColor(Color.RED);
        	g.fillRect(a+1650, z+70, 200, 50);
        	g.fillRect(a+1680, z+25, 150, 50);

        	// Draw windows
        	g.setColor(Color.CYAN);
        	g.fillRect(a+1700, z+30, 30, 30);
        	g.fillRect(a+1780, z+30, 30, 30);

        	// Draw wheels
        	g.setColor(Color.BLACK);
        	g.fillOval(a+1680, z+90, 50, 50);
        	g.fillOval(a+1780, z+90, 50, 50);
		a=a-20;//speed
		slep1();
		if(a+100<w1)
		{
			repaint();
		}
		else
		{
			repaint();
			z=30;
			//x=x+30;
		}



		//car1
		w=getWidth();
		
		g.setColor(c1);
		
		g.setColor(c2);
		g.fillRoundRect(x,y+20,100,40,5,5);
		g.fillArc(x+90,y+20,20,40,270,180);
		g.setColor(c1);
		
		g.fillRoundRect(x+20,y,70,25,10,10);
		g.setColor(Color.white);
		g.fillRect(x+20,y+5,20,25);
		g.setColor(Color.black);
		g.fillRoundRect(x+55,y+10,10,20,10,10);
		g.fillOval(x+10,y+50,25,25);
		g.fillOval(x+60,y+50,25,25);
		g.setColor(Color.white);
		g.fillOval(x+15,y+55,10,10);
		g.fillOval(x+65,y+55,10,10);
		x=x+10;
		slep();
		if(x+100<w)
		{
			repaint();
		}
		else
		{
			repaint();
			x=10;
			//y=y+10;
		}
		

		//Trees1
		g.setColor(Color.red);
		g.fillRect(50,900,10,40);
		g.setColor(Color.green);
		g.fillRect(20,950,10,900);
		g.drawLine(10,900,100,900);
		g.drawLine(50,860,100,900);
		g.drawLine(50,860,10,900);

		g.drawLine(10,800,100,800);
		g.drawLine(50,760,100,800);
		g.drawLine(50,760,10,800);

		g.drawLine(10,861,100,861);
		g.drawLine(50,800,100,860);
		g.drawLine(50,800,10,860);
		
		//Trees2
		g.setColor(Color.red);
		g.fillRect(545,900,10,40);
		g.setColor(Color.green);
		g.drawLine(500,900,600,900);
		g.drawLine(500,900,540,850);
		g.drawLine(600,900,540,850);

		g.drawLine(500,850,590,850);//2nd
		g.drawLine(500,850,540,800);//2nd
		g.drawLine(590,850,540,800);//2nd

		g.drawLine(500,800,590,800);//3nd
		g.drawLine(550,750,500,800);//3rd
		g.drawLine(550,750,590,800);//3rd

		//Tres3
		g.setColor(Color.red);
		g.fillRect(1045,900,10,40);
		g.setColor(Color.green);
		g.drawLine(1000,900,1100,900);
		g.drawLine(1000,900,1040,850);
		g.drawLine(1100,900,1040,850);

		g.drawLine(1000,850,1080,850);//2nd
		g.drawLine(1000,850,1040,800);//2nd
		g.drawLine(1080,850,1040,800);//2nd

		g.drawLine(1010,800,1080,800);//3nd
		g.drawLine(1040,765,1010,800);//3rd
		g.drawLine(1040,765,1080,800);//3rd
		//Tree4
		g.setColor(Color.red);
		g.fillRect(1515,900,10,40);
		g.setColor(Color.green);
		g.drawLine(1480,900,1570,900);
		g.drawLine(1480,900,1520,850);
		g.drawLine(1570,900,1520,850);

		g.drawLine(1480,850,1560,850);//2nd
		g.drawLine(1480,850,1520,800);//2nd
		g.drawLine(1560,850,1520,800);//2nd

		g.drawLine(1480,800,1560,800);//3nd
		g.drawLine(1520,765,1480,800);//3rd
		g.drawLine(1520,765,1560,800);//3rd
		

	}
}





