import java.io.*;
import java.util.*;
public class Lyon {

	public static void main(String[] args) throws IOException{

 	File f=new File("data.txt");
 	Date d=new Date();
 	System.out.println(d);

 	FileOutputStream fos=new FileOutputStream(f);
 	ObjectOutputStream oos=new ObjectOutputStream(fos);

 	oos.writeObject(d);  //because Date d object is serializable
 	oos.close();


 	FileInputStream fin=new FileInputStream(f);
 	ObjectInputStream ois=new ObjectInputStream(fin);
 	Object o=ois.readObject();
 	Date d1=new (Date)o;
 	System.out.println(d1);

 	o=ois.readObject();


 	Date d2=new Date();
 	System.out.println(d2);

	}

}