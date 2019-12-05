import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet implements ActionListener{
	Button b;

	FlowLayout f;
	
	public void init(){
		b=new Button();
		f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		b.addActionListener(this);
		add(b);
		System.out.println(getLayout());
	}

	public void actionPerformed(ActionEvent e){
		System.out.println();
	}
	
}





// <Applet code="AppletA"  width=200 height=200></Applet>