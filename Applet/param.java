import java.Applet.*;
class param extends Applet
{
	int n1,n2,ans;
	public void init()
	{
		int n1=Integer.parseInt(getParameter("a"));
		int n2=Integer.parseInt(getParameter("b"));
		ans=n1+n2;
	}
	public void paint(Graphic g)
	{
		g.drawString("Addition = "+ans,100,100);
	}
	
}

