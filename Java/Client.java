import java.util.*;
import java.net.*;
import java.io.*;
class Client 
{
	public static void main(String[] ar) throws Exception
	{
		Socket s=new Socket("localhost",5555);
		
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		System.out.println("Enter a no: ");
		dos.writeUTF(new Scanner(System.in).next());
		
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		System.out.println("Factorial from server: "+dis.readUTF());
		dos.close();
	}		
}
