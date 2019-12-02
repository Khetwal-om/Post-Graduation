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

