import java.io.*;
import java.net.*;




class ClientA{
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("localhost",8080);
		OutputStream os=socket.getOutputStream();

		DataOutputStream dos=new DataOutputStream(os);
		dos.writeUTF("hi from client");


		
	}
}