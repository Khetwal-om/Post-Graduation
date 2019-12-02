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
