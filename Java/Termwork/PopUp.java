import java.awt.*;
import java.awt.event.*;


public class PopUp{
	public static void main(String[] args) {
		Frame f=new Frame("login Window");
		f.setSize(600,600);
		f.setVisible(true);
		f.setLayout(null);

		Label username=new Label("Enter username");
		username.setBounds(50,50,100,10);
		TextField t1=new TextField();
		t1.setBounds(160,50,100,20);

		Label password=new Label("Enter password");
		password.setBounds(50,100,100,10);
		TextField t2=new TextField();
		t2.setBounds(160,100,100,20);

		Button b=new Button("Login");
		b.setBounds(130,150,50,20);

		f.add(username);
		f.add(password);
		f.add(t1);
		f.add(t2);
		f.add(b);



		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String m="Welcome";
				String s=t1.getText();
				if(s.length()!=0){
					 if(s.equals(t2.getText()))
					 	m+=s;
					 else
					 	m="invalid";


					 Frame r=new Frame();
					 r.add(new Label(m));
					 r.setSize(200,200);
					 r.setVisible(true);
				}
			}
		});
		
	}	
}


// <applet code="PopUp" width=400 height=400 ></applet>