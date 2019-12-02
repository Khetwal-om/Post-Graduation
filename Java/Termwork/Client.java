import java.net.*;
import java.io.*;



class Client{
	public static void main(String[] args) throws Exception {
		 Socket socket=new Socket("localhost",8080);
		 OutputStream os=socket.getOutputStream();
		 DataOutputStream dos=new DataOutputStream(os);
		 dos.writeUTF("Hello ...");
		 dos.close();
		 socket.close();
	}
}