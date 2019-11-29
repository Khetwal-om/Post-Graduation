import java.util.*;
import java.net.*;
import java.io.*;
class Server 
{
	public static void main(String[] ar) throws Exception
	{
		ServerSocket ss=new ServerSocket(5555);
		Socket s=ss.accept();
		System.out.println("Connected...");
		InputStream is=s.getInputStream();
		DataInputStream dis=new DataInputStream(is);
		int num=Integer.parseInt(dis.readUTF());
		
		int fact=1;
		for(int i=num;i>1;i--)
			fact*=i;
		
		OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF(fact+"");
		dos.close();
	}		
}
