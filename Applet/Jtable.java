import java.awt.*;
import javax.swing.*;
class table extends JFrame
{
	JTable tbl;
	table()
	{
		setVisible(true);
		setSize(500,500);
		setLayout(new FlowLayout());
		String head[]={"ENO","NAME","SALARY"};
		String data[][]={{"101","sai","60000"},
		          {"102","ram","78000"},
		          {"103","om","67000"}};
		tbl=new JTable(data , head);
	//	add(tbl);
	JScrollPane js=new JScrollPane(tbl);
	add(js);
	}
	public static void main(String ar[])
	{
		new table();
	}
}
