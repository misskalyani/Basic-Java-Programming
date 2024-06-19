package game;
public class indoor
{
	String gname;
	int player;
	public indoor()
	{
		gname="Chees";
		player=4;
	}
	public indoor(String gname,int player)
	{
		this.gname=gname;
		this.player=player;
	}
	public void disp()
	{
		
		System.out.println(gname+"\tt\t"+player);
	}
}
