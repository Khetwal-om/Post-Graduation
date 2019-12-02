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