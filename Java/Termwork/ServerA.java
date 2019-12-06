import java.io.*;
import java.net.*;




class ServerA{
	public static void main(String[] args) throws Exception {
		 ServerSocket serversocket=new ServerSocket(8080);
		 Socket s=serversocket.accept();


		 
		 InputStream is=s.getInputStream();
		 DataInputStream dis=new DataInputStream(is);
		 String m=dis.readUTF();
		 System.out.println(m);


	 	OutputStream os=s.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF("hello from serversocket");
	



	}
}