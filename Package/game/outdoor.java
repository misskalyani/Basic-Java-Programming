package game;
public class outdoor
{
	String gname;
	int player;
	public outdoor()
	{
		gname="Chees";
		player=4;
	}
	public outdoor(String gname,int player)
	{
		this.gname=gname;
		this.player=player;
	}
	public void disp()
	{
		System.out.println(gname+"\tt\t"+player);
	}
}
