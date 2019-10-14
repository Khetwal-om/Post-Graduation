import java.io.*;


public class SerializationConcept
{
	public static void main(String[] args) throws IOException,ClassNotFoundException{

		Check object=new Check("first","second");
		FileOutputStream fobj=new FileOutputStream("data.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fobj);
		oos.writeObject(object);

		oos.close();
		fobj.close();



		Check obj=null;
		FileInputStream file=new FileInputStream("data.txt");
		ObjectInputStream ois=new ObjectInputStream(file);

		
		obj=(Check)ois.readObject();
		System.out.println(obj.a);
		System.out.println(obj.b);

		file.close();
		ois.close();






	}
}


class Check implements Serializable
{
	transient String a;
	String b;
	public Check(String s1,String s2)
	{
		this.a=s1;
		this.b=s2;
	}

}

