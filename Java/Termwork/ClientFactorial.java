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