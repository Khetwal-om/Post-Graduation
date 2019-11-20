import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="A" width=500 height=500>
</applet>*/


public class A extends Applet implements ItemListener{

	List c;

	public void init(){
		c=new List(2,true);
		c.add("First");
		c.add("Second");
		c.add("Third");
		c.addItemListener(this);
		add(c);

	}

	public void itemStateChanged(ItemEvent e){
		System.out.println(e);
		System.out.println(e.getItem());

	}
}