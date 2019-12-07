1. Daemon Thread

```java
class DaemonThread{
	public static void main(String[] args) throws Exception {
		for(int i=0;i<7;i++){
			Thread.sleep(1200);
			System.out.println("main thread : "+i);
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

**The simplified one**

```java
class DaemonThread{
	public static void main(String[] args) throws Exception {
		for(int i=0;i<7;i++){
			Thread.sleep(1200);
			System.out.println("main thread: "+i);
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
				sleep(5000);
				i++;
				if(i==3){
					break;
				}

			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
```

**Output**

```java
DaemonThread : 0
DaemonThread : 1
DaemonThread : 2
DaemonThread : 3
DaemonThread : 4
DaemonThread : 5
DaemonThread : 6
Exiting from main
From B
```


**IF  setDaemon(true) is commented**

```java
DaemonThread : 0
DaemonThread : 1
DaemonThread : 2
DaemonThread : 3
DaemonThread : 4
DaemonThread : 5
DaemonThread : 6
Exiting from main
From B
From B
From B

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



11. popup window


```java
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

```
<<<<<<< HEAD



12. Transient Variable

```java
import java.io.*;
public class TransientDemo
{
	public static void main(String[] ar) throws Exception
	{
		B obj=new B();
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		B b=(B)ois.readObject();
		System.out.println("Transient variable n="+b.n);
		System.out.println("s= "+b.s);
		System.out.println("sal= "+b.sal);
	}
}

class B implements Serializable
{
	transient int n=10;
	String s="abcd";
	int sal=1234;
}

```



---


### Static import

```java
import  static java.lang.Math.*;



class StaticImport{
	public static void main(String[] args) {
		System.out.println(sqrt(50));

	}
}
```





**Another example**


```java

import static java.lang.System.*;


class StaticImport{
	public static void main(String[] args) {

		out.println("abc");
	}
}
```




---








13. 
=======
>>>>>>> 87f10aaeb2b5c5764dfedf0d73b6c989ef794abe




14. Saving to a file

```java

// Java program to demonstrate redirection in System.out.println() 
import java.io.*; 

public class SystemFact 
{ 
	public static void main(String arr[]) throws FileNotFoundException 
	{ 
		// Creating a File object that represents the disk file. 
		PrintStream o = new PrintStream(new File("A.txt")); 

		// Store current System.out before assigning a new value 
		PrintStream console = System.out; 

		// Assign o to output stream 
		System.setOut(o); 
		System.out.println("This will be written to the text file"); 

		// Use stored value for output stream 
		System.setOut(console); 
		System.out.println("This will be written on the console!"); 
	} 
} 


```








15. 

```java
import java.io.*;



class FileOne{
	public static void main(String[] args) throws IOException{
			
			FileReader fr=new FileReader("A.md");

			int k=0;

			while((k=fr.read())!=-1){
				System.out.println((char)k);
			}

			k=0;

			FileWriter fw=new FileWriter("A.md",true);
			fw.write("11122233300000oooooooooooopppppppppppqqqqqqqwwwwwww");
			fw.close();

			while((k=fr.read())!=-1){
				System.out.print((char)k);
			}


	}
}
```

16. Try with resource

```java

import java.io.*;
public class B {
	public static void main(String[] args) {
		try(
			C c=new C();
			)
			{

			}

	}
}

class C implements Closeable{
	public void close(){
		System.out.println("Closed");
	}
}

```



18. Part B




---

# RMI


1. RemoteInterface

```java
import java.rmi.Remote;


public interface RemoteInterface extends Remote{
	public int add(int a,int b) throws Exception;
}
```



2. ImplementInterface

```java

import java.rmi.server.*;

public class ImplementInterface extends UnicastRemoteObject implements RemoteInterface{

	public ImplementInterface() throws Exception{
		super();
	}

	public int add(int x,int y){
		return x+y;
	}
}


```

3. RMIClient


```java
import java.rmi.*;
public class RMIClient{
	public static void main(String[] args) throws Exception {
		RemoteInterface obj=(RemoteInterface)Naming.lookup("ADD");
		int n=obj.add(1,1);
		System.out.println(n);
	}
}
```



4. RMIServer

```java

import java.rmi.*;


public class RMIServer{
	public static void main(String[] args) throws Exception {
		ImplementInterface =new ImplementInterface();

		rebind("ADD",obj);
		System.out.println("Server Started");
	}
}

```


---










16. Grabage collection

  * Inorder to use memory from heap JVM use its default garbage collector that works
  automatically for this purpose  *System* class defines a method **gc()** which is 
  invoked by JVM automatic garbage collector based on certain algorithms to call
  finalize() method.

  finalize() method is is responsible to free memory .









```java

class GarbageCollection{
	public static void main(String[] args) {
		B b=new B();
		b=null;


		System.gc();
	}
}


class B{
	public void finalize(){
		System.out.println("finalize method called");
	}
}

``` 



**Another one**


```java
class GarbageCollection{
	public static void main(String[] args) {
		B b=new B();
		b=new B();

		System.gc();
	}
}


class B{
	public void finalize(){
		System.out.println("finalize method called");
	}
}
```







18. HashSet

```java
import java.util.*;


class HashMapExample{
	public static void main(String[] args) {
		HashSet h=new HashSet();

		h.add("i");
		h.add("hello");
		Iterator ia=h.iterator();
		while(ia.hasNext()){
			System.out.println(ia.next());
		}
		// System.out.println(h.get(0));
	}
}
```



19. HashSet

```java 
import java.util.*;


class HashMapExample{
	public static void main(String[] args) {
		HashSet h=new HashSet();

		h.add("i");
		h.add("hello");
		Iterator ia=h.iterator();
		while(ia.hasNext()){
			System.out.println(ia.next());
		}
		// System.out.println(h.get(0));

		for (Object o : h) {
			System.out.println(o.getClass().getSimpleName());

			System.out.println(o instanceof String);
			if(o instanceof String){
			String string=(String)o;
			System.out.println(string.toUpperCase());
			}
		}
	}
}	

```



20. RMI




1. 

```java
import java.rmi.*;

public interface CreateInterface extends Remote{
	public int add(int x,int y) throws Exception;
}
```


2. 

```java
import java.rmi.server.*;

public class ImplementInterfac extends UnicastRemoteObject implements CreateInterface{

	public ImplementInterfac() throws Exception
	{	
		super();
	}

	public int add(int x,int y) {
		return x+y;
	}
}
```



3. 
```java
import java.rmi.*;
public class Server{
  public static void main(String[] args) throws Exception{
  	   	
  		ImplementInterfac obj=new ImplementInterfac();
  	   	Naming.rebind("ADD",obj);
  	   	System.out.println("Server ...");
  }
}

```



4. 

```java
import java.rmi.*;


public class Client{
	public static void main(String[] args)  throws Exception{
		CreateInterface obj=(CreateInterface)Naming.lookup("ADD");

		int n=obj.add(10,20);
		System.out.println(n);
	}
}
```