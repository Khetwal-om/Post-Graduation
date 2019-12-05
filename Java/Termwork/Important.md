1. Daemon Thread

```java
class DaemonThread{
	public static void main(String[] args) throws Exception {
		for(int i=0;i<7;i++){
			Thread.sleep(1200);
			System.out.println("DaemonThread : "+i);
		}

		B b=new B();
		b.setDaemon(true); //Daemon thread
		b.start();
		System.out.println("Exiting from main");
	}
}

class B extends Thread{
	int i=0;
	public void run(){
		while(true){
			try{
				System.out.println("From B");
				sleep(1500);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

```



2. Save  object state to a file

```java
import java.util.Date;
import java.util.*;
import java.io.*;
public class DateDemo {

   public static void main(String args[])  throws Exception{
     	FileOutputStream fos=new FileOutputStream("b.txt");
     	ObjectOutputStream oos=new ObjectOutputStream(fos);
     	Date date=new Date();
     	B b=new B(date);
     	oos.writeObject(b);

     	fos.close();
     	oos.close();


     	FileInputStream fis=new FileInputStream("b.txt");
     	ObjectInputStream ois=new ObjectInputStream(fis);
     	B bob=(B)ois.readObject();
     	System.out.println(bob.date);
     	fis.close();
     	ois.close();

   }

}

class B implements Serializable{
	transient String date;
	B(Date date){
		this.date=date.toString();
	}
}


















 // // Instantiate a Date object
 //      Date date = new Date();

 //      // display time and date using toString()
 //      System.out.println(date.toString());
 //   



```



3. Use of transient

```java
import java.io.*;
class SaveObject{
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		B b=new B(7);
		oos.writeObject(b);
		fos.close();
		oos.close();

		FileInputStream fis=new FileInputStream("a.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		B bob=(B)ois.readObject();
		System.out.println(bob.data);

		fis.close();
		ois.close();
	}
}

class B implements Serializable{
	transient int data;
	B(int data){
		this.data=data;
	}
}


```



4. 








5. Dynamic Method Dispatch


```java
class DynamicMethodDispatch{
	public static void main(String[] args) {
		 	
		 	A obj=new B();
		 	obj.show();
	}
}


class A{

	void show(){
		System.out.println("show method of A");
	}
}

class B extends A{

	void show(){
		System.out.println("show method of B");
	}
}
```



6. Finding factorial of a number using Client and  Server

**ClientFactorial**

```java
import java.io.*;
import java.net.*;
import java.util.*;


class ClientFactorial{
	public static void main(String[] args)throws Exception {
		Socket socket=new Socket("localhost",8080);
		OutputStream os=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		System.out.println("Enter the number to get the factorial");
		Scanner input=new Scanner(System.in);
		dos.writeUTF(input.next());


		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		System.out.println("The factorial is "+dis.readUTF());
		
	}
}
```


**ServerFactorial**

```java
import java.util.*;
import java.io.*;

import java.net.*;



class ServerFactorial{
	public static void main(String[] args)throws Exception {
		ServerSocket serversocket=new ServerSocket(8080);
		Socket socket=serversocket.accept();	
		System.out.println("Connected (:");

		InputStream is=socket.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		String data=dis.readUTF();
		int element=Integer.parseInt(data);
		int factorial=1;
		while(element>0){
			factorial=factorial*element;
			element-=1;
		}

		OutputStream os=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF(Integer.toString(factorial));
		// socket.close();

	}
}
```




7. **Changing a file to URL**


```java
import java.io.*;
import java.util.*;
import java.net.*;

class FileToUrl {
	public static void main(String[] args)throws Exception {
		File f=new File("Client.java");
		URL url=f.toURL();
		InputStream is=url.openStream();
		BufferedReader bfr=new BufferedReader(new InputStreamReader(is));
		String s="";
		while((s=bfr.readLine())!=null){
			System.out.println(s);
		}

		bfr.close();
		is.close();
	}
}
```


---

## Applet 

---

8. **Applet LifeCycle**

```java
import java.applet.*;
import java.awt.*;


public class AppletA extends Applet{
		Graphics g;
		public void init(){
			System.out.println("This is init");
		}
		public void start(){
			// setBackGround(Color.red);
			System.out.println("This is start");
		}
		public void paint(Graphics g){
			g.drawString("abcdefghij",20,20);
			setBackground(Color.red);
		}
		public void stop(){
			System.out.println("This is stop");
		}
		public void destroy(){
			System.out.println("This is destroy");
		}
}

// <Applet code="AppletA"  width=200 height=200></Applet>
```


 * We can change the color by creating a new object of **Color** class.


```java
import java.applet.*;
import java.awt.*;


public class AppletA extends Applet{
		Graphics g;

		Color teal=new Color(0,128,128);
		public void init(){
			System.out.println("This is init");
		}
		public void start(){
			// setBackGround(Color.red);
			System.out.println("This is start");

		}
		public void paint(Graphics g){
			g.drawString("abcdefghij",20,20);
			setBackground(teal);

		}
		public void stop(){
			System.out.println("This is stop");
		}
		public void destroy(){
			System.out.println("This is destroy");
		}
}

// <Applet code="AppletA"  width=200 height=200></Applet>
```


 * **Event delegation model using Button**

```java
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet{
	
	Button b;
	public void init(){
		b=new Button();
		b.addActionListener(new B());
		add(b);
	}


	class B implements ActionListener{
		public void actionPerformed(ActionEvent e){
			setBackground(Color.red);
		}
	}
}





// <Applet code="AppletA"  width=200 height=200></Applet>
```


 * **Implementing above without nested inner class**

```java
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet implements ActionListener{
	
	Button b;
	public void init(){
		b=new Button();
		b.addActionListener(this);
		add(b);
	}


 	
		public void actionPerformed(ActionEvent e){
			setBackground(Color.red);
		}
	
}





// <Applet code="AppletA"  width=200 height=200></Applet>

```


 * **Changing background color using different buttons**

```java
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet implements ActionListener{
	
	Button yellow,red;
	public void init(){
		yellow=new Button();
		red=new Button();
		yellow.addActionListener(this);
		red.addActionListener(this);
		add(yellow);
		add(red);

	}


 	
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==yellow){
				setBackground(Color.yellow);
			}
			else if(e.getSource()==red){
				setBackground(Color.red);
			}
		}
	
}





// <Applet code="AppletA"  width=200 height=200></Applet>
```

 * **Adapter class should be used because they don't impel to override each and every
 method**

```java
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet implements MouseListener{
	TextField t;

	public void init(){
		t=new TextField();
		t.addMouseListener(this);
		add(t);
	}

	public void mouseClicked(MouseEvent e){
		System.out.println(t.getText());
	}
	

	
}


 AppletA is not abstract and does not override abstract method mouseExited(MouseEvent) in MouseListener
public class AppletA extends Applet implements MouseListener{
       


// <Applet code="AppletA"  width=200 height=200></Applet>
```


 * **After using Adapter class**

```java
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet{
	TextField t;

	public void init(){
	t=new TextField();
	t.addMouseListener(new MouseAdapter(){
	public void mouseClicked(MouseEvent e){
		System.out.println(t.getText());
	}
		}
		);
		add(t);
	}
	
}





// <Applet code="AppletA"  width=200 height=200></Applet>

```



 * **TextListener**

```java
import java.applet.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class AppletA extends Applet implements TextListener{
	TextField t;

	
	public void init(){
		t=new TextField("Abc");
		t.addTextListener(this);
		add(t);
	}

	public void textValueChanged(TextEvent e){
		System.out.println(t.getText());
	}
	
}





// <Applet code="AppletA"  width=200 height=200></Applet>
```




10. Layouts



  1. FlowLayout

```java
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
	}

	public void actionPerformed(ActionEvent e){
		System.out.println();
	}
	
}





// <Applet code="AppletA"  width=200 height=200></Applet>
```