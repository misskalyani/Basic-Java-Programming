package SLIP16;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//Q2) Write a program to design a screen using Awt that,
class notepad extends Frame
{
	MenuBar mb;
	Menu File,Edit,About;
	MenuItem New,Open,Save,ShowAbout,Exit;
	TextArea ta;
	notepad()
	{
		setVisible(true);
		setSize(500,500);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new TextArea();
		add(ta);
		mb=new MenuBar();
		File=new Menu("File");
		Edit=new Menu("Edit");
		About=new Menu("About");
	
		New =new MenuItem("New");
		Open =new MenuItem("Open");
		Save =new MenuItem("Save");
		ShowAbout=new MenuItem("Show About");
		Exit =new MenuItem("Exit");
		
		mb.add(File);
		File.add(New);File.add(Open);File.add(Save);File.add(ShowAbout);
	
		mb.add(Edit);
		mb.add(About);
		setMenuBar(mb);
	}
	
}
public class Q2 
{
	
	public static void main(String[] args) 
	{
		new notepad();

	}

}
