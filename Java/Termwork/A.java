import java.awt.*;
import java.awt.event.*;

class A
{
public static void main(String a[])
{
C obj = new C();
}
}
class C extends Frame implements ActionListener
{
MenuBar mb;
Menu m;
MenuItem m1,m2;

C()
{
	setVisible(true);
	setSize(222,222);
	setTitle("him");
	setLayout(new FlowLayout());
	mb = new MenuBar();
	m = new Menu("File");
	m1 = new MenuItem("open");
	m1.addActionListener(this);
	m2 = new MenuItem("close");
	m2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
	setVisible(false);
	}
	});
	m.add(m1);m.add(m2);
	mb.add(m);
	setMenuBar(mb);
	}
	public void actionPerformed(ActionEvent e)
	{
	Dialog d = new Dialog(new C(),"ss");
	d.setVisible(true);
	d.setSize(222,222);
}
}