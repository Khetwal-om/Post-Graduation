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