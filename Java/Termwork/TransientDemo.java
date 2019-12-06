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
	int n=10;
	String s="abcd";
	int sal=1234;
}
