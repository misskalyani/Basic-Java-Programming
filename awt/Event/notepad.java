import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	MenuBar mb;
	Menu file,edit,help,format;
	MenuItem ne,Open,save,exit;
	TextArea ta;
	demo()
	{
	    setVisible(true);
	    setSize(600,500);
	    ta=new TextArea();
	    add(ta);
	    mb=new MenuBar();
	    file=new Menu("File");
	    edit=new Menu("Edit");
	    help=new Menu("Help");
	    format=new Menu("Format");

      ne=new MenuItem("New");
      Open=new MenuItem("Open");
      save=new MenuItem("Save");
      exit=new MenuItem("Exit");
      
	    mb.add(file);
	    file.add(ne);file.add(Open);file.add(save);file.add(exit);
	    mb.add(format);
	    mb.add(edit);
	    mb.add(help);
	    setMenuBar(mb);
	    Open.addActionListener(this);
	    save.addActionListener(this);
	    ne.addActionListener(this);
	    exit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getSource()==Open)
	    {
	             try
	             {
	                  JFileChooser jf=new JFileChooser();
	                  jf.showOpenDialog(this);
	                  File f1=jf.getSelectedFile();
	                  String s1=f1.getName();
	                  FileReader f2=new FileReader(s1);
	                  BufferedReader br=new BufferedReader(f2);
	                  while((s1=br.readLine())!=null)
	                  {
	                      ta.append(s1+"\n");
	                  }
	                  
	             }
	             catch(Exception e)
	             {}
	    }
	    if(ae.getSource()==save)
	    {
	          try
	          {
	              JFileChooser jf=new JFileChooser();
	              jf.showSaveDialog(this);
	              File f1=jf.getSelectedFile();
	              String s1=f1.getName();
	              FileWriter f2=new FileWriter(s1);
	              BufferedWriter bw=new BufferedWriter(f2);
	              String s2=ta.getText();
	              bw.write(s2);
	              bw.close();
	              f2.close();
	          }
	          catch(Exception e)
	          {}
	    }
	    if(ae.getSource()==exit)
	    {
	          dispose();
	    }
	    if(ae.getSource()==ne)
	    {
	          ta.setText("");
	    }
	}
	public static void main(String ar[])
	{
	  new demo();
	}
}
